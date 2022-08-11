package chap06;

public class Chap06Excercise2 {
    public static void main(String[] args) {
        //Variable Declaration
        int num = 3;
        int num1 = 5;
        int num2 = 5;
        char char1 = 'n';
        int month = 7;
        int i = 3;
        int w = 4;
        int a = 7;
        int x = 10;
        int b = 11;
        int y = 31;
        int c = 22;
        int z = 22;
        String str1 = "yes";


        //1 ~ 2
        if ((num >= 0) && (num <= 9)) {
            System.out.println("변수 " + num + "은 0 이상 9 이하.");
        } else if ((num < 0) || (num > 9)) {
            System.out.println("변수" + num + "은 0보다 작거나 9보다 크다.");
        }
        //3
        if((num1 == 5) && (num2 != 999)){
            System.out.println("변수 " + num1 + "은 5와 같고 변수" + num2 + "은 999와 같지 않다.");
        }
        //4
        if((char1 == 'y') || (str1 == "yes")){
            System.out.println("변수 " + char1 + "은 \'y\'와 같거나 변수 " + str1 + "은 \"yes\"와 같음.");
        }
        //5~8
        if((month >= 3) && (month <= 5)){
            System.out.println("변수 " + "month는 3이상 5이하");
        }else if((month >= 6) && (month <= 8)){
            System.out.println("변수 " + month + "는 6이상 8이하");
        }else if((month >= 9) && (month <= 11)){
            System.out.println("변수 " + month + "는 9이상 11이하");
        }else if((month == 12) || ((month > 0 ) && (month <= 2))){
            System.out.println("변수" + month + "는 12와 같거나 0보다 크고 2 이하");
        }
        //9
        if((i != w) && (num1 == num2)){
            System.out.println("변수 " + i + "와 " + w + "가 같지않고 변수 " + num1 + "과 " + num2 + "가 동일하다.");
        }
        //10
        if((a == x) || (b == y) || (c == z)){
            System.out.println("변수 " + a + "와 " + x + "가 같거나 변수 " + b + "와 " + y + "가 같거나 변수 " + c + "와 " + z + "가 같음");
        }
    }
}
