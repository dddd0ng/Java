package com.swcamp.Section03.filterstream;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. BufferedWriter와 BufferedReader에 대해 이해하고 사용할 수 있다. */

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(
                    new FileWriter(
                            "src/main/java/com/swcamp/section03/filterstream/testBuffered.txt"
                    )
            );

            /* 설명. 마지막에 덧씌운 보조스트림의 메소드를 활용한다. */
            bw.write("눈이\n");
            bw.write("하늘에서\n");
            bw.write("내려오네");

            /* 설명. 내부적으로 버퍼가 다 차지 않으면 데이터의 출력이 일어나지 않는다.
                원하는 시점에 출력을 할 때는 flush()를 수동으로 작성해야 한다. */
            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {

                /* 설명. 출력 스트림이 close()될 때는 내부적으로 flush()가 동작한다. */
                if(bw != null) bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        BufferedReader br = null;
        try {
            br = new BufferedReader(
                    new FileReader(
                            "src/main/java/com/swcamp/section03/filterstream/testBuffered.txt"
                    ));

//            String oneLine = br.readLine();
//            System.out.println(oneLine);
            String input = "";
            while((input = br.readLine()) != null) {
                System.out.println(input);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(br != null) br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
