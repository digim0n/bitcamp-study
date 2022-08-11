package chap17;

public class ThrowZeroException2 {
    public static void calcTest() {
        // 숫자를 0으로 나눔
        int num = 10 / 0;

        // 결과표시
        System.out.println("10/ 결과: " + num);
    }

    public static void main(String[] args) {
        try {
            // calcTest메소드 호출
            calcTest();
        } catch (ArithmeticException e) { // 0나누기 예외처리
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("처리 완료");
    }
}