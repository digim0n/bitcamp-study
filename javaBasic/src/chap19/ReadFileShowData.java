package chap19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileShowData {
    public static void main(String[] args) {
        try{
            //Scanner클래스의 객체 생성
            Scanner sin = new Scanner(new File("src/chap19/sample.txt"));

            String strLine1 = sin.nextLine(); //1행 읽기
            String strLine2 = sin.nextLine(); //1행 읽기

            System.out.println(strLine1);
            System.out.println(strLine2);
            // 스트림 닫기
            sin.close();

        }catch(FileNotFoundException e){
            System.out.println("입력파일을 찾을 수 없습니다.");
        }
    }
}
