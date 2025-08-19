package com.swcamp.Section04.testapp.run;

import com.swcamp.Section04.testapp.service.MemberService;

import java.util.Scanner;

public class Application1 {

    private static final MemberService ms = new MemberService();
    private static int chooseMemNo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("=====회원 관리 프로그램=====");
            System.out.println("1.모든 회원 정보 보기");
            System.out.println("2.회원 찾기");
            System.out.println("3.회원 가입");
            System.out.println("4.회원 정보 수정");
            System.out.println("5.회원 탈퇴");
            System.out.println("9.프로그램 종료");
            System.out.print("메뉴를 선택해 주세요 : ");
            int input = sc.nextInt();

            /*단어 통일화
            * 조회 : find
            * 추가 : regist
            * 수정 : modify
            * 삭제 : remove
            * */

            switch(input){
                case 1: ms.findAllMembers(); break;
                case 2: ms.findMemberBy(chooseMemNo); break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 9:
                    System.out.println("프로그램을 종료하겠습니다.");
                    return;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다.");
            }
        }

        }
    private static Object chooseMemNo(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("해당 회원 번호를 입력하세요 : ");
        return sc2.nextInt();
    }
    }