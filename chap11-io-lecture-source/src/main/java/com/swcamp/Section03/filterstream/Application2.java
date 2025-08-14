package com.swcamp.Section03.filterstream;

import java.io.*;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 표준입출력(콘솔과의 입출력)스트림을 이해하고 활용할 수 있다. */
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        System.in));
        System.out.print("문자열 입력: ");

        try {
            String input = br.readLine();
            System.out.println("input = " + input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(br != null) br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        BufferedWriter bw = null;
        OutputStreamWriter osw = null;
        osw = new OutputStreamWriter(System.out);
        bw = new BufferedWriter(osw);

        try {
            bw.write("println이 좋은 거구나~");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(bw != null) bw.close();          // 제일 외곽의 보조스트림만 close()해도 내부 스트림들이 모두 닫힘
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
