package chap17;

public class ExceptionOutPrint {
    public static void main(String[] args) {
        try {
            // int형 배열 정의
            int[] intArray = new int[5];

            // 배열에 값을 할당
            System.out.println("배열에 숫자를 할당합니다.");
            intArray[10] = 50; // 예외를 일부러 발생시키는 대입
            // 결과 표시
            System.out.println("배열에 50을 할당했습니다.");

        } catch (ArrayIndexOutOfBoundsException e) { // 변수명 e는 예외객체의 위치정보를 받음
            System.out.println("배열의 요소수를 초과했습니다.");
            System.out.println(e + "라는 예외가 발생했습니다."); // 예외 객체의 정보를 받음
        } finally {
            System.out.println("예외처리의 마지막 처리입니다.");
        }
        System.out.println("처리종료");
    }
}
