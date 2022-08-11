package chap19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIn {
    private Scanner sin = null; // Scanner클래스
    // 파일 여는 방법
    public boolean open(String fname) {
        boolean sts = true;
        try {
            // 읽기 파일 열기에 해당하는 처리
            sin = new Scanner(new File(fname));
        } catch (FileNotFoundException e) {
            System.out.println("파일명에 오류가 있습니다.\n" + e);
            sts = false;
        }
        return sts;
    }

    //읽은 파일 데이터에서 1행 읽기 처리를 수행하는 메소드
    public String readLine() {
        String buff;

        // 읽을 수 있는 데이터가 있는지 확인
        if (sin.hasNextLine()) {
            buff = sin.nextLine();
        } else {
            buff = null;
        }
        return buff;
    }

    // 스트림을 닫는 메소드
    public boolean close() {
        boolean sts = true;
        try {
            sin.close(); // 스트림 닫기
        } catch (Exception e) {
            System.out.println("스트림 닫기 오류\n" + e);
            sts = false;
        }
        return sts;
    }
}
