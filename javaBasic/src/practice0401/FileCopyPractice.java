package practice0401;

import java.io.*;
import java.util.*;

public class FileCopyPractice {
    public static void main(String[] args) {
        try{
            String tempStr = null;
            ArrayList<String> inputList = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            String sourceFile, destFile;

            System.out.print("소스 파일 경로를 입력하시오: ");
            sourceFile = sc.nextLine();
            System.out.print("대상 파일 경로를 입력하시오: ");
            destFile = sc.nextLine();

            //파일 로드
            Scanner sin = new Scanner(new File(sourceFile));

            while(sin.hasNextLine()){
                tempStr = sin.nextLine();
                inputList.add(tempStr);
            }
            sin.close();
            System.out.println("파일 로드 완료.");

            PrintWriter pw = new PrintWriter
                    (new BufferedWriter(new FileWriter(destFile)));

            for(int i=0; i<inputList.size(); i++){
                pw.println(inputList.get(i));
            }

            pw.close();
            System.out.println("파일 쓰기 완료.");


        }catch(FileNotFoundException e){
            System.out.println("파일명의 지정이 부정합니다.");
        }catch(IOException e){
            System.out.println("입출력 에러입니다.");
        }
    }
}