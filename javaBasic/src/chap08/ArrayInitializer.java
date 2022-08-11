package chap08;

public class ArrayInitializer {
    public static void main(String[] args){
        int[] jasonAPT1 = new int[3];

        // 요소초기화
        jasonAPT1[0] = 3;
        jasonAPT1[1] = 1;
        jasonAPT1[2] = 10;

        System.out.println(" - 제이슨아파트 1동 가주년수 - ");
        System.out.println("0호 : " + jasonAPT1[0]);
        System.out.println("1호 : " + jasonAPT1[1]);
        System.out.println("2호 : " + jasonAPT1[2]);

        System.out.println();

        // 주거년수를 관리하기 위한 배열변수의 선언과 요소 초기화
        int[] jasonAPT2 = { 3, 1, 10 };

        System.out.println(" - 제이슨아파트 2동 거주년수 - ");
        System.out.println("0호 : " + jasonAPT2[0]);
        System.out.println("1호 : " + jasonAPT2[1]);
        System.out.println("2호 : " + jasonAPT2[2]);
    }
}
