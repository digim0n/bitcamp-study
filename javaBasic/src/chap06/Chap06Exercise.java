package chap06;

import java.util.Scanner;

public class Chap06Exercise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Receiving input
        System.out.print("숫자 입력: ");
        int input = sc.nextInt();

        //Check if input is even
        if((input % 2) == 0){
            System.out.println("입력숫자[" + input + "]는 짝수입니다.");
        }else{
            System.out.println("입력숫자[" + input + "]는 홀수입니다.");
        }


    }
}
