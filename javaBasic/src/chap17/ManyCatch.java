package chap17;

public class ManyCatch {
    public static void main(String[] args) {
        try {
            // int형 배열 정의
            int[] intArray = new int[5];

            // 배열에 값 할당
            System.out.println("배열에 숫자를 할당합니다.");
            intArray[10] = 50; // 예외를 일부러 발생시키는 대입
            // intArray[0] = 50; //올바르게 할당
            System.out.println("배열에 50을 할당했습니다."); // 결과표시

            int num = intArray[0] / 0; // 예외를 일부러 발생시크는 0나누기
            System.out.println("나누기 결과: " + num );

        } catch (ArrayIndexOutOfBoundsException e) { // 최대 배열 요소수를 초과하는 예외 처리
            System.out.println("배열 요소수를 초과했습니다.");
        } catch (ArithmeticException e) { // 0나누기 예외처리
            System.out.println("0으로 나눌 수 없습니다.");
        } finally { // finally블록
            System.out.println("예외처리의 마지막 처리입니다.");
        }
        System.out.println("처리종료");
    }
}
