package practice03;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        //Declaration
        Scanner sc = new Scanner(System.in);
        int input;

        //User Input
        System.out.print("정수를 입력하시오: ");
        input = sc.nextInt();

        if(input<=0){
            System.out.println();
        }else{
            for(int i=0; i<input; i++){
                System.out.print("*");
            }
        }
    }
}
