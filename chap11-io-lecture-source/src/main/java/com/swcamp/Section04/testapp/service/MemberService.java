package com.swcamp.Section04.testapp.service;

import com.swcamp.Section04.testapp.aggregate.AccountStatus;
import com.swcamp.Section04.testapp.aggregate.Member;
import com.swcamp.Section04.testapp.repository.MemberRepository;

import java.util.ArrayList;

/* 설명. 트랜잭션 처리(DB와의 CRUD이후 성공 및 실패 여부 처리) 및 비즈니스 로직 담당 및 유효성 검사*/
public class MemberService {

    //    private final MemberRepository memberRepository = new MemberRepository();
    //생성자추가하고 값을넣고 아래랑 같이 쓰거나, 위에처럼 쓰거나
    private final MemberRepository memberRepository;

    public MemberService() {
        memberRepository = new MemberRepository();
    }


    public void findAllMembers() {
        ArrayList<Member> result = memberRepository.findAllMembers();

        if (!result.isEmpty()) {
            System.out.println("Service에서 조회 확인: ");

            for (Member member : result) {
                System.out.println("member = " + member);
            }
        } else {
            System.out.println("우리 사이트 회원 없음");
        }
    }

    public void findMemberBy(int memNo) {
        Member findMember = memberRepository.findMemberBy(memNo);
        if (findMember != null) { // 회원이 조회 되는 경우
            System.out.println("회원 조회 성공 : " + findMember);
        } else {                  //회원 조회가 안되는 경우
            System.out.println(memNo + "번호의 회원은 존재하지 않습니다.");}

    }

    public void registMember(Member registMember) {
        /* 설명. 회원가입에서 입력받은 값을 제외하고도 두 개의 데이터 추가*/
        // 회원 번호 생성
        int lastNo = memberRepository.findLastMemberNo();
        registMember.setMemNo(lastNo + 1);


        // 회원 활성화 상태 추가
        registMember.setAccountStatus(AccountStatus.ACTIVE);


        //DML의 성공 여부는 int값으로 들어옴
        int result = memberRepository.registMember(registMember);

        if(result == 1) {
            System.out.println(registMember.getId()+ "회원님 환영합니다!");
        }else{
            System.out.println("회원 가입 실패");
        }

    }
    public Member findMemberForMod(int memNo){
        Member selectedMember = memberRepository.findMemberBy(memNo);

        Member copyMember = null;
        if (selectedMember != null) {
            /* 설명. 프론트로 반환하기 전에 사본 만들어 Repository가 가진 회원 객체 대신 사본을 반환함(feat. 오염 방지)*/
            copyMember = new Member();
//            Member copyMember = new Member(); <= 지역때매 Return에 있는 copyMember못써서
//            // 지역에서 따로 초기화하고 null값 생성, copyMember = new Member(); 초기화
            copyMember.setMemNo(selectedMember.getMemNo());
            copyMember.setId(selectedMember.getId());
            copyMember.setPwd(selectedMember.getPwd());
            copyMember.setAge(selectedMember.getAge());

            /* 설명. 취미의 경우는 배열이므로 깊은 복사를 해 줘야함(.clone())*/
            String[] copiedHobbies = selectedMember.getHobbies().clone();
            copyMember.setHobbies(copiedHobbies);
            copyMember.setBloodType(selectedMember.getBloodType());
            copyMember.setAccountStatus(selectedMember.getAccountStatus());
        } else {
            System.out.println("그런 회원은 없네요.");
        }

        return copyMember;
    }


    public void modifyMember(Member reformedMember) {
        int result = memberRepository.modifyMember(reformedMember);
        //memberRepository => update tbl_member set age = 1, ~~~ <= DB측면

        if (result > 0 ) { //result == 1보다 result > 0 을 많이 씀
            System.out.println(reformedMember.getId()+"회원님의 정보가 수정 되었습니다.");
        }else{
            System.out.println("회원 정보 수정이 실패하였습니다.");
        }
    }

    public void removeMember(int memNo) {
        int result = memberRepository.removeMember(memNo);

        if (result>0){
            System.out.println("회원님 그동안 감사했습니다.");
        }else {
            System.out.println("회원탈퇴 실패");
        }
    }
}