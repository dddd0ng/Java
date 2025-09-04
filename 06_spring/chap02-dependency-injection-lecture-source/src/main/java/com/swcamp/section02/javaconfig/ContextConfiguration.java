package com.swcamp.section02.javaconfig;
//java -> @bean
//자바 형태로 하면 이런식
import com.swcamp.common.Account;
import com.swcamp.common.MemberDTO;
import com.swcamp.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//component니까
@Configuration
public class ContextConfiguration {

    @Bean
    public Account accountGenerator(){
        return new PersonalAccount("110-234-4567890",20);
    }


    @Bean
    public MemberDTO memberGenerator(){

        /* 설명. 생성자 주입(의존관계의 다른 bean 주입*/
//        return new MemberDTO(1,"홍길동","010-222-3333","hong@gmail.com",accountGenerator());

    MemberDTO member=new MemberDTO();
    member.setSequence(1);
    member.setName("유관순");
    member.setPhone("010-111-2222");
    member.setEmail("Yu@gmail.com");
    member.setPersonalAccount(accountGenerator());
        return member;
    }
    }
