package chap18;

import java.util.ArrayList;

public class UseArrayList6 {
    public static void main(String[] args) {

        ArrayList<String> strList = new ArrayList<String>();

        //문자열 추가
        strList.add("Good morning");
        strList.add("Hello");
        strList.add("Bye");

        System.out.println("* 변경 전 데이터 목록");
        for(int i=0; i<strList.size(); i++ ){
            System.out.println((i+1)+"번째 추가 데이터는 " + strList.get(i) + "입니다.");
        }
        //3번쨰 데이터 변경
        strList.set(2, "Good Bye!");
        //2번째 데이터 삭제
        strList.remove(1);

        System.out.println("\n* 변경 후 데이터 목록");
        for(int i=0; i<strList.size(); i++ ){
            System.out.println((i+1)+"번째 추가 데이터는 " + strList.get(i) + "입니다.");
        }
    }
}
