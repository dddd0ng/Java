package com.swcamp.chap04.section01.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class Application2{

    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }
    public static Integer solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        
//        변수.readLine(); // 한줄씩 읽음
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //동전 종류의 수
        int K = Integer.parseInt(st.nextToken()); // 지불할 금액
        
        int[] coins = new int[N];
        for (int i = 0; i < coins.length; i++) { //N or coins.length
            coins[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        
        /* 설명. 큰 금액의 동전부터 지불하여 반복*/
        for (int i = N-1 ; i >=0; i--) { //이득이 큰 동전부터(이득 = 그리디에서의 최적)
            if (coins[i] <= K) {            // 지불을 고민 할 동전을 추려서
                count += K / coins[i];    //선택한 동전으로 최대한 나누고     /k=잔액, 밸런스
//                K = K-coins[i] * count; // 아래 코드랑 똑같음
                K %=coins[i];               //남은 금액은 다시 K원에 대입
            }

        }
        return count;
    }
}
