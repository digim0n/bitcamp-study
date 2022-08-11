package chap19;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFileManyData {
    public static void main(String[] args) {
        String[] strArray = {"* 전세계 - 감사합니다.",
                "한국어 - 감사합니다",
                "일본어 - 아리가또 ",
                "영어 - Thank you",
                "중국어 - 시예시예",
                "독일어 - 단케",
                "스페인어 - 그라시아스",
                "프랑스어 - 메르시",
                "하와이어 - 마할로",
                "베트남어 - 캄온"};
        try{
            PrintWriter pw = new PrintWriter
                    (new BufferedWriter(new FileWriter("src/chap19/output2.txt")));

            for(int i=0; i<strArray.length; i++){
                pw.println(strArray[i]);
            }

            pw.close();
            System.out.println("파일에 쓰기 완료하였습니다.");
        }catch(IOException e){
            System.out.println(e+" 입출력 오류입니다");
        }
    }
}
