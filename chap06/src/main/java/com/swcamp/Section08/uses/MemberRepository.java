package com.swcamp.Section08.uses;
public class MemberRepository {

    /* 설명. 총 30명의 회원을 관리할 수 있는 Database의 느낌으로 작성 */
    private final static Member[] staticMembers = new Member[30]; // 총 저장할 수 있는 회원의 수를 가진 배열
    private static int count;                                     // 현재 저장된 회원의 수 - 1

    public void regist(Member[] members) {
        if(count > 25) {
            System.out.println("회원이 가득찼습니다.");
            return;
        }
        for (int i = 0; i < members.length; i++) {
            staticMembers[count++] = members[i];
        }

        System.out.println("회원 가입을 축하합니다!");
    }

    public Member[] findAllMember() {
        return staticMembers;
    }
}