package com.swcamp.Section04.testapp.repository;

import com.swcamp.Section04.testapp.aggregate.AccountStatus;
import com.swcamp.Section04.testapp.aggregate.BloodType;
import com.swcamp.Section04.testapp.aggregate.Member;

import java.io.*;
import java.util.ArrayList;


/* 설명. 데이터베이스(현재는 파일) 개념과 입출력을 위해 만들어진 계층이며 성공 데이터 또는 성공/실패 여부를 반환*/
// 지금과 같이 주로 컬렉션 데이터를 관리함
public class MemberRepository {

    /* 설명. 초기에 Member 파일이 없다면 만들어 더미데이터를 쌓는다*/
    private final ArrayList<Member> memberList = new ArrayList<>();
    private final File file =
            new File("src/main/java/com/swcamp/Section04/testapp/db/memberDB.dat");

/* 설명. 프로그램 구동 시 처음에 실행할 내용들*/
    public MemberRepository() {
        if (!file.exists()) {
            ArrayList<Member> defaultMemberList = new ArrayList<>();
            defaultMemberList.add(new Member(1,"user01","pass01",20,new String[]{"발레","수영"}, BloodType.A, AccountStatus.ACTIVE));
            defaultMemberList.add(new Member(2,"user02","pass02",18,new String[]{"게임","영화시청"}, BloodType.B, AccountStatus.ACTIVE));
            defaultMemberList.add(new Member(3,"user03","pass03",23,new String[]{"음악감상","독서","명상"}, BloodType.AB, AccountStatus.ACTIVE));

            saveMembers(defaultMemberList);

        }
        loadMembers();
    }

    /* 설명. ArrayList<Member>를 받으면 파일로 컬렉션에 담긴 회원들을 출력하는 메소드(Feat.덮어씌우는 기능)*/
    private void saveMembers(ArrayList<Member> members) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            for (Member member : members) {
                oos.writeObject(member);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try{
                if(oos != null) oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    private void loadMembers() {
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            while(true) {
                memberList.add((Member) ois.readObject());
            }
        } catch (EOFException e) {
            System.out.println("회원 정보 읽어오기 완료!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Member> findAllMembers() {
        return memberList;
    }
    public void selectAllMembers() {
    }

    public Member findMemberBy(int memNo) {
        for (Member member : memberList) {
            if (member.getMemNo() == memNo) {
                return member;
            }
        }
        return null;
    }
}
