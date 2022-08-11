package chap05;

public class ArithmeticOperator {
    public static void main(String[] args) {
        // 계산용 값을 관리하는 변수를 선언하고 값을 할당
        int a = 9;
        int b = 4;

        // 응답 변수
        //int answer;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 덧셈
        System.out.println("a + b = " + (a + b));

        // 뺄셈
        System.out.println("a - b = " + (a - b));

        // 곱셈
        System.out.println("a * b = " + (a * b));

        // 나눗셈
        System.out.println("a / b = " + ((double) a / (double) b));

        // 나머지
        System.out.println("a % b = " + (a % b));
    }
}