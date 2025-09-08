package com.swcamp.section01.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    private final MemberDAO memberDAO;

    @Autowired
    public MemberService(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }
//service계층에 있는 메서드를 보통 aop
    public List<MemberDTO> findAllMembers() {

        //로그 작성
        //스프링 시큐리티 적용
        System.out.println("target -> finAllMembers 실행, 타겟이 실행되는것 로그 실행");
        return memberDAO.selectAllMembers();
    }

    public MemberDTO findMemberBy(int index) {

        //로그 작성
        //스프링 시큐리티 적용
        System.out.println("target -> findMemberBy 실행");
        return memberDAO.selectMemberBy(index);
    }
}
