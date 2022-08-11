package chap17;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            // int형 배열
            int[] intArray = new int[5];

            // 배열에 값을 할당
            System.out.println("배열에 숫자를 할당합니다.");
            intArray[10] = 50; // 예외를 일부러 발생시키는 대입
            // intArray[0] = 50; // 올바르게 할당

            // 결과 표시
            System.out.println("배열에 50을 할당했습니다.");
        } catch (ArrayIndexOutOfBoundsException e) { // 최대 배열요소수를 초과하는 예외 처리
            System.out.println("배열의 요소수를 초과했습니다.");
        } finally {
            System.out.println("예외처리의 마지막 처리입니다."); // finally블록
        }
        System.out.println("처리 종료");
    }
}
