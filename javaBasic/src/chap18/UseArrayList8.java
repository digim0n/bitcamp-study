package chap18;

import java.util.ArrayList;

public class UseArrayList8 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>();

        //문자열 추가
        strList.add("Good morning");
        strList.add("Hello");
        strList.add("Bye");

        //반복처리를 이용하여 전건 표시
        System.out.println("* 지우기 전의 데이터 일람 ");
        for(int i=0; i<strList.size(); i++ ){
            System.out.println((i+1)+"번째 저장 데이터는 " + strList.get(i) + "입니다.");
        }

        //ArrayList배열 저장된 데이터 삭제
        strList.clear();

        System.out.println("\n* 지우기 후 데이터 목록 ");
        //ArrayList배열 저장 데이터 수 확인
        if(strList.isEmpty()){
            System.out.println("데이터 1개 없음 ");
        }else{
            for(int i=0; i<strList.size(); i++ ){
                System.out.println((i+1)+"번째 저장 데이터는 " + strList.get(i) + "입니다.");
            }
        }
    }
}
