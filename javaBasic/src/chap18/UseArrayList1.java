package chap18;

import java.util.ArrayList;

public class UseArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>();

        strList.add("Good morning");
        System.out.println("첫번째 추가시 모든 데이터는 " + strList + "입니다.");

        strList.add("Hello");
        System.out.println("2번 추가시의 모든 데이터는 " + strList + "입니다.");

        strList.add("Bye");
        System.out.println("3번 추가시의 모든 데이터는 " + strList + "입니다.");
    }
}
