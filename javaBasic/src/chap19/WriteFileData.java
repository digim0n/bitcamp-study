package chap19;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFileData {
    public static void main(String[] args) {
        try{
            // 쓰기 파일 열기
            PrintWriter pw = new PrintWriter
                    (new BufferedWriter(new FileWriter("src/chap19/output.txt")));
            pw.println("* 나라별 감사말 감사합니다");
            pw.println("한국어 - 감사합니다");
            pw.println("영어 - Thank you");

            // 쓰기 파일 닫기
            pw.close();
            System.out.println("파일에 쓰기가 완료되었습니다.");

        }catch (IOException e) {
            System.out.println(e+" 입출력 오류입니다.");
        }
    }
}
