package com.swcamp.chap03.section01.graph_search;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Application4 {
    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    /* 설명. 양방향(한쪽만 알아도 된다는 뜻) 그래프면, 1차원 배열로 방문배열을 작성 할 수 있다. */
    static boolean[] visit;

    static int[][] arr; //컴퓨터한테 인지 시키려면 2차원 배열이 필요함

    static int node, line, start; // N, M, V

    static Queue<Integer> que= new LinkedList<>();






    /* 설명. bfs 또는 dfs의 결과로 나온 문자열 조립을 위한 문자열 처리 담당 객체 */
    static StringBuilder sb = new StringBuilder();

    public static String solution(String input) throws IOException {

        /* 설명. 두 번째 케이스부터 다시 StringBuilder를 비워줘야 함 */
        sb.delete(0, sb.length());

        BufferedReader br = toBufferedReader(input);

        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        arr = new int[node + 1][node + 1];
        visit = new boolean[node + 1];

        for (int i = 0; i < line; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        dfs(start);
        sb.append("\n");

        visit = new boolean[node + 1];  // dfs와 bfs 모두 같은 방문배열을 사용하기 때문
        bfs(start);

        System.out.println("현재까지 쌓인 내용: " + sb);

        return sb.toString();       // StringBuilder를 String으로 변환
    }

    private static void dfs(int start) {
        visit[start] = true;
        sb.append(start + " ");

        for (int i = 1; i <= node ; i++) {
            if(arr[start][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }
    }

    private static void bfs(int start) {
        que.offer(start);
        visit[start] = true;

        while(!que.isEmpty()) {
            start = que.poll();
            sb.append(start + " ");

            for (int i = 1; i <= node ; i++) {
                if(arr[start][i] == 1 && !visit[i]) {
                    que.offer(i);
                    visit[i] = true;
                }
            }
        }
    }
}
