package com.swcamp.Section04.testapp.repository;

import com.swcamp.Section04.testapp.aggregate.AccountStatus;
import com.swcamp.Section04.testapp.aggregate.BloodType;
import com.swcamp.Section04.testapp.aggregate.Member;

import java.io.File;
import java.util.ArrayList;

public class MemberRepository {

    /* 설명. 초기에 Member 파일이 없다면 만들어 더미데이터를 쌓는다*/
    private final ArrayList<Member> members = new ArrayList<>();
    private final File file =
            new File("src/main/java/com/swcamp/Section04/testapp/db/memberDB.dat");


    public MemberRepository() {
        if (file.exists()) {
            ArrayList<Member> defaultMemberList = new ArrayList<>();
            defaultMemberList.add(new Member(1,"user01","pass01",20,new String[]{"발레","수영"}, BloodType.A, AccountStatus.ACTIVE));
            defaultMemberList.add(new Member(2,"user02","pass02",18,new String[]{"게임","영화시청"}, BloodType.B, AccountStatus.ACTIVE));
            defaultMemberList.add(new Member(3,"user03","pass03",23,new String[]{"음악감상","독서","명상"}, BloodType.AB, AccountStatus.ACTIVE));
        }
    }

    public void selectAllMembers() {
    }
}
