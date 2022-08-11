package practice03;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args){
        //Declaration
        Scanner sc = new Scanner(System.in);
        int input;
        int total = 1;

        //User Input
        System.out.print("정수를 입력하시오: ");
        input = sc.nextInt();

        //0이하면 0 출력, 0보다 큰 정수면 그 숫자의 계승 출력.
        if(input <=0){
            System.out.println("Result = 1");
        }else{
            for(int i=1; i<=input; i++){
                total *= i;
            }
            System.out.println("Result = " + total);
        }
    }
}
