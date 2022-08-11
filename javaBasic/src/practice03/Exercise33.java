package practice03;

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input;

        System.out.print("정수를 입력하시오: ");
        input = sc.nextInt();

        if(input == 0){
            System.out.println("zero");
        }else{
            System.out.println("not zero");
        }
    }
}
