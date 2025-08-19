package com.swcamp.Section04.testapp.service;

import com.swcamp.Section04.testapp.repository.MemberRepository;

public class MemberService {

//    private final MemberRepository memberRepository = new MemberRepository();
    //생성자추가하고 값을넣고 아래랑 같이 쓰거나, 위에처럼 쓰거나
    private final MemberRepository memberRepository;
    public MemberService() {
        memberRepository = new MemberRepository();

    }

    public void findAllMembers() {
        memberRepository.selectAllMembers();
    }
}
