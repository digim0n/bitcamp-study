package chap08;

public class ChangeArrayElement3 {
    public static void main(String[] args) {

        // 음료가격을 관리하는 배열 jasonPrice의 선언과 요소 초기화
        int[] jasonPrice = { 3000, 4000, 5000 };

        // 음료가격을 관리하는 배열 gangnamPrice를 선언하고 배열 jasonPrice의 각 요소로 초기화
        int[] gangnamPrice = new int[3];

        gangnamPrice[0] = jasonPrice[0];
        gangnamPrice[1] = jasonPrice[1];
        gangnamPrice[2] = jasonPrice[2];


        System.out.println("===== 홍대점 ===== ");
        System.out.println("차　　:" + jasonPrice[0] + "원");
        System.out.println("홍차　:" + jasonPrice[1] + "원");
        System.out.println("커피 :" + jasonPrice[2] + "원");

        System.out.println("===== 강남점 =====");
        System.out.println("차　　:" + gangnamPrice[0] + "원");
        System.out.println("홍차　:" + gangnamPrice[1] + "원");
        System.out.println("커피 :" + gangnamPrice[2] + "원");

        System.out.println();
        System.out.println("가격변경 후");

        // 강남점의 차 가격 변경
        gangnamPrice[1] = 4500;

        System.out.println("===== 홍대점 =====");
        System.out.println("차 　:" + jasonPrice[0] + "원");
        System.out.println("홍차　:" + jasonPrice[1] + "원");
        System.out.println("커피 :" + jasonPrice[2] + "원");

        System.out.println("===== 강남점 =====");
        System.out.println("차　　:" + gangnamPrice[0] + "원");
        System.out.println("홍차　:" + gangnamPrice[1] + "원");
        System.out.println("커피 :" + gangnamPrice[2] + "원");
    }
}
