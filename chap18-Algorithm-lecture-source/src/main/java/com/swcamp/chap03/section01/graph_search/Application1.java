package com.swcamp.chap03.section01.graph_search;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Application1 {
    //재귀를 쓰면 스택 => dfs
    static boolean[] visit;     // 모든 그래프는 방문 배열이 필요함 <- 필수
    //boolean 초깃값 false
    static int[][] map;      // 그래프를 2차원 배열로 매핑(인접리스트)
    static int count;        //오염된 컴퓨터의 수
    static int node, edge;    // node와 edge의 개념을 담을 변수


    //문자열에서 한줄씩 읽어올 수 있는 BufferedReader를 반환하는 수업용 별도의 메소드
    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }


    public static Integer solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        node = Integer.parseInt(br.readLine());
        edge = Integer.parseInt(br.readLine());

        /* 설명. 노드와 간선에 대한 정보가 담긴 map(node의 번호와 인덱스 번호 일치를 위해 +1)*/
        map = new int[node + 1][node + 1]; // 인덱스는0부터 시작, 노드는1부터 시작이라 숫자 맞추기위해 +1

        /* 설명. 방문배열(simple path(단순 경로)를 위한 것이지만, 실제로는 stackoverflow방지 목적)*/
        //노드의 갯수가 정해졌으니 visit(방문배열)
        visit = new boolean[node + 1];

        /* 설명. 인접리스트에 그래프 정보 작성*/
        for (int i = 0; i < edge; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");   //구분자가 " "(띄어쓰기)일 경우 생략 가능)
            StringTokenizer st = new StringTokenizer(br.readLine());   //구분자가 " "(띄어쓰기)일 경우 생략 가능)

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());


            /* 설명. 무방향 그래프는 매핑 시 대각을 기준으로 체크한다.*/
//            map[a][b] = 1;
//            map[b][a] = 1; // 양방향(무방향)그래프라 이런식으로 사용
            map[a][b] = map[b][a] = 1;
        }
        dfs(1);
        //실제로 매핑 됐는지 체크해보는 코드
//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map[i].length; j++) {
//                System.out.println(Arrays.toString(map[i]));
//            }
//            System.out.println();
//        }
        return count - 1;
    }


    //재귀함수로 DFS 알고리즘을 구현 할 메소드
    private static void dfs(int start) {
        visit[start] = true;

        //위에 return count 일 시 if(start != 1) 가능
        count++; //방문했다 + 오염시켰다

        for (int i = 1; i < node; i++) {
//                System.out.println(start+"컴퓨터와 연결된"+i+
//                        "빈 컴퓨터 방은 전 visit배열"+Arrays.toString(visit));

                if(map[start][i] == 1&&!visit[i]){
                    //start i => start 배열의 인덱스 i 서치
                    //방문한적이 없으면서(!visit[i])
                    dfs(i); // 재귀
                }
            }
    }
}

