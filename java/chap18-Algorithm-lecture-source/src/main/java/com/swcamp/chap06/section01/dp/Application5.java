package com.swcamp.chap06.section01.dp;

import java.io.*;

public class Application5 {

    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }
    public static Integer solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);

        int n = Integer.parseInt(br.readLine());

        //처음엔 일단 그리디로 접근하고 각이 안나오면 dp로 접근
        int[] dp=new int[n+1]; //최대 정수를 구하는거라 dp로 접근
        int[] arr=new int[n+1]; //문제에서 요구한 점수가 있는 계단 배열

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        if(n >= 1) dp[1]=arr[1];           //계단이 1개 일 때의 최적의 해(수동)
        if(n >= 2) dp[2]=arr[1]+arr[2];    //계딴이 2개 일 때의 최적의 해(수동)

        if(n >= 3) {
            for (int i = 3; i <= n; i++) {
                dp[i] = Math.max(dp[i-2], dp[i-3] + arr[i-1])+arr[i];
            }
        }
return dp[n];
    }
}
