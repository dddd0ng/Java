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
        }
        System.out.println(memNo + "번호의 회원은 존재하지 않습니다.");
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
}