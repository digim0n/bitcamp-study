package chap14;

public class Calc2 {
    public static void main(String[] args) {
        Calc1 calc = new Calc1();

        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 + " + " + num2 + " = " + calc.addition(num1, num2));

        double num3 = 45.2;
        double num4 = 16.9;
        System.out.println(num3 + " + " + num4 + " = " + calc.addition(num3, num4));
    }
}
