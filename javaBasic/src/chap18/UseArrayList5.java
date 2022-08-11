package chap18;

import java.util.ArrayList;

public class UseArrayList5 {
    public static void main(String[] args) {

        ArrayList<String> strList = new ArrayList<String>();

        // 문자열 추가
        strList.add("Good morning");
        strList.add("Hello");
        strList.add("Bye");

        // 반복처리를 이용하여 전건 표시
        System.out.println("* 변경 전 데이터 목록");
        for(int i=0; i<strList.size(); i++ ){
            System.out.println((i+1)+"번쨰 저장 데이터는 " + strList.get(i) + "입니다.");
        }

        //3번째 데이터 변경
        strList.set(2, "Good Bye!");

        System.out.println("\n* 변경후 데이터 목록");
        for(int i=0; i<strList.size(); i++ ){
            System.out.println((i+1)+"번째 저장데이터는 " + strList.get(i) + "입니다.");
        }
    }
}
