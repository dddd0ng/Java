package com.swcamp.Section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. FileWriter에 대해 이해할 수 있다. */
        FileWriter fw = null;
        try {
            fw = new FileWriter(
                    "src/main/java/com/swcamp/section02/stream/testWriter.txt");
            fw.write("한글");
            fw.write("짱\n");
            fw.write("세종대왕 만만세!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
