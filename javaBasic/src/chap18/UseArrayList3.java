package chap18;

import java.util.ArrayList;

public class UseArrayList3 {
    public static void main(String[] args) {
        // 문자열 처리하는 ArrayList배열
        ArrayList<String> strList = new ArrayList<String>();

        //1번째 문자열 추가 및 표시
        strList.add("Good morning");
        System.out.println("1번째 저장 데이터는 " + strList.get(0) + "입니다.");

        //2번째 문자열 추가 및 표시
        strList.add("Hello");
        System.out.println("2번째 저장 데이터는 " + strList.get(1) + "입니다.");

        //3번째 문자열 추가 및 표시
        strList.add("Bye");
        System.out.println("3번째 저장 데이터는 " + strList.get(2) + "입니다.");

        //ArrayList배열의 저장데이터수 표시
        System.out.println("저장 데이터 수는 " + strList.size() + "입니다.");
    }
}
