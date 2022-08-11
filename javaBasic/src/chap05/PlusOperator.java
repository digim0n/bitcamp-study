package chap05;

public class PlusOperator {

    public static void main(String[] args) {

        int i = 3;
        int j = 1;

        // 문자열 연결을 사용하지 않고 표시
        System.out.print("1행 문자 ");
        System.out.print(i);
        System.out.println("행의 프로그램으로 표시함!");

        // 문자열 연결을 사용하여 표시
        System.out.println("실제로 " + j + "행의 프로그램으로 표시하는 것도 가능!");

        // 사칙연산의 우선순위 규칙에 따라 문자열 연결 및 계산순서 확인
        System.out.println("i + j = " + i + j);
        System.out.println("i + j = " + (i + j));
    }
}