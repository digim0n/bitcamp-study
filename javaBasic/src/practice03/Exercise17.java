package practice03;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args){
        //Declaration
        Scanner sc = new Scanner(System.in);
        int input;

        //User Input
        System.out.print("정수를 입력하시오: ");
        input = sc.nextInt();

        if(((input>=-10) && (input<0)) || (input>=10)){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
    }
}
