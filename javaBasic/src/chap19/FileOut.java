package chap19;

import java.io.*;

public class FileOut {
    private BufferedWriter bw = null; // BufferedWriter클래스

    // 파일 열기 메소드
    public boolean open(String fname) {
        boolean sts = true;
        try {
            // 쓰기 파일 열기에 해당하는 처리
            bw = new BufferedWriter(new FileWriter(fname));
        } catch (IOException e) {
            System.out.println("파일명에 오류가 있습니다.\n" + e);
            sts = false;
        }
        return sts;
    }

    // 파일에 데이터를 쓰는 메소드
    public boolean writeln(String str) {
        boolean sts = true;
        try {
            bw.write(str); // 1행분의 데이터를 파일출력
            bw.newLine(); // 줄구분 기호 출력
        } catch (IOException e) {
            System.out.println("쓰기 오류 \n" + e);
            sts = false;
        }
        return sts;
    }

    // 파일 닫기 메소드
    public boolean close(){
        boolean sts = true;
        try {
            bw.close(); // 파일 닫기
        } catch (IOException e) {
            System.out.println("파일 닫기 오류 \n" + e);
            sts = false;
        }
        return sts;
    }
}
