package practice04;

public class Exercise05 {
    static int integerPower(int a) {
        return (a * a);
    }

    public static void main(String[] args){
        int test = 9;
        int result;

        result = integerPower(test);
        System.out.println(test + "^2 = " + result);
    }
}
