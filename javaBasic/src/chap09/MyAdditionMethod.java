package chap09;

public class MyAdditionMethod {
    static int additionMethod(int a, int b){
        int sum = a + b;

        return sum;
    }

    public static void main(String[] args){
        //선언
        int a = 5;
        int b = 10;

        int answer = additionMethod(a, b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + answer);

    }

}
