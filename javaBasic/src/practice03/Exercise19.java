package practice03;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args){
        //Declaration
        Scanner sc = new Scanner(System.in);
        int input;

        //User Input
        System.out.print("정수를 입력하시오: ");
        input = sc.nextInt();

        switch(input){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("others");
        }
    }
}
