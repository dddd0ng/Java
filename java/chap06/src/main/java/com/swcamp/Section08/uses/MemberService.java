package com.swcamp.Section08.uses;

public class MemberService {
    public void signUpFiveMembers() {

        /* 설명. 프론트에서 입력받은 5명의 회원이 넘어와서 자바의 객체배열로 담겨 있음을 가정 */
        Member[] members = new Member[5];
        members[0] = new Member(1, "user01", "pass01", "홍길동", 20, 'M');
        members[1] = new Member(2, "user02", "pass02", "유관순", 16, 'F');
        members[2] = new Member(3, "user03", "pass03", "이순신", 40, 'M');
        members[3] = new Member(4, "user04", "pass04", "신사임당", 36, 'F');
        members[4] = new Member(5, "user05", "pass05", "윤봉길", 22, 'M');

        System.out.println("회원을 등록합니다.");

        MemberRepository repository = new MemberRepository();
        repository.regist(members);
    }

    public void showAllMembers() {
        MemberRepository repository = new MemberRepository();
        Member[] returnMembers = repository.findAllMember();
        for (Member member : returnMembers) {
            System.out.println(member);
        }
    }
}
