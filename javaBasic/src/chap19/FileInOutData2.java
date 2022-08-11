package chap19;

import java.util.ArrayList;

public class FileInOutData2 {
    public static void main(String[] args) {
        int sum = 0; // 총점 저장 변수
        double ave = 0.0; // 평균 점수 저장 변수
        String[] strData = null; // 읽기 데이터의 분할 저장용 배열
        String strLine = null; // 1행 데이터 저장용 변ㅅ구

        ArrayList<String> subjectList = new ArrayList<String>(); // 교과 저장용 배열
        ArrayList<Integer> scoreList = new ArrayList<Integer>(); // 점수 저장용 배열

        // 제공 클래스 객체화
        FileIn in = new FileIn(); // 파일 입력
        FileOut out = new FileOut(); // 파일 출력

        // 과목 데이터 파일로드
        if (in.open("src/chap19/subject_data.csv") == false) {
            System.exit(1);
        }
        // 모든 데이터를 배열로 가져오기
        while ((strLine = in.readLine()) != null) {
            // 읽기 한줄 데이터 쉼표로 분할
            strData = strLine.split(",");
            //각 배열에 데이터 저장
            subjectList.add(strData[0]);
            scoreList.add(Integer.parseInt(strData[1]));
        }
        // 스트림 닫기
        if (in.close() == false) {
            System.exit(2);
        }
        System.out.println("파일 로드가 완료되었습니다. ");

        // 쓰기 파일 열기
        if (out.open("src/chap19/statistics.txt") == false) {
            System.exit(3);
        }

        // 읽기 데이터를 파일에 쓰기
        for (int i = 0; i < subjectList.size(); i++) {
            out.writeln(subjectList.get(i) + "<===>" + scoreList.get(i));
        }
        // 총점을 계산하고 파일에 쓰기
        for (int i = 0; i < scoreList.size(); i++) {
            sum += scoreList.get(i);
        }
        out.writeln("총점: " + sum);

        // 평균 계산하고 파일 쓰기
        ave = (double) sum / scoreList.size();
        out.writeln("평균: " + ave);

        // 쓰기 파일 닫기
        if (out.close() == false) {
            System.exit(4);
        }
        System.out.println("파일에 쓰기가 종료되었습니다.");
    }
}
