package chap19;

import java.io.*;
import java.util.*;

public class FileInOutData1 {
    public static void main(String[] args) {
        int sum = 0; // 총점 저장용 변수
        double ave = 0.0; // 평균점수 저장용 변수
        String[] strData = null; // 읽기 데이터 분할 저장용 배열

        ArrayList<String> subjectList = new ArrayList<String>(); // 과목 저장용 배열
        ArrayList<Integer> scoreList = new ArrayList<Integer>(); // 점수 저장용 배열

        try {
            // 과목 데이터 파일 로드
            Scanner sin = new Scanner(new File("src/chap19/subject_data.csv"));

            // 모든 데이터를 배열로 가져오기
            while (sin.hasNextLine()) {
                // 읽기한줄데이터 쉼표로 분할
                strData = sin.nextLine().split(",");

                // 각 배열에 데이터 저장
                subjectList.add(strData[0]);
                scoreList.add(Integer.parseInt(strData[1]));
            }
            // 스트림 닫기
            sin.close();
            System.out.println("파일로드가 완료되었습니다.");

            // 쓰가 파일 열기
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(
                    "src/chap19/statistics.txt")));

            // 쓰기 파일 열기
            for (int i = 0; i < subjectList.size(); i++) {
                pw.println(subjectList.get(i) + "<===>" + scoreList.get(i));
            }

            // 총점을 계산하고 파일에 쓰기
            for (int i = 0; i < scoreList.size(); i++) {
                sum += scoreList.get(i);
            }
            pw.println("총점: " + sum);

            // 평균점수를 계산하고 파일에 쓰기
            ave = (double) sum / scoreList.size();
            pw.println("평균：" + ave);

            // 쓰기 파일 닫기
            pw.close();
            System.out.println("파일에 쓰기가 종료되었습니다.");

        } catch (FileNotFoundException e) {
            System.out.println("입력 파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println(e + " 입출력 오류입니다.");
        }
    }
}
