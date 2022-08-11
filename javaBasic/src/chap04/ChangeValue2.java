package chap04;

public class ChangeValue2 {

    public static void main(String[] args) {
        //숫자를 두 변수에 준비
        int num1 = 7;
        int num2 = 4;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2 + '\n' + "************");

        //num2에 num1값 할당
        num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}