package chap05;

public class PriorityCheck {
    public static void main(String[] args) {

        // 계산용 값을 관리하는 변수를 선언하고 값 할당
        int a = 9;
        int b = 1;
        int c = 3;

        // 응답 변수
        int answer;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        answer = a + b * c;
        System.out.println("a + b * c = " + answer);

        answer = (a + b) * c;
        System.out.println("(a + b) * c = " + answer);
    }
}