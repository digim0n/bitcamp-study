package practice04;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args){
        //선언
        Scanner sc = new Scanner(System.in);
        int[] input = new int[10];
        //입력
        for(int i=0; i<10; i++){
            System.out.print((i+1) + "번째 숫자를 입력하시오: ");
            input[i] = sc.nextInt();
        }
        //짝수 출력
        System.out.print("짝수: ");
        for(int i=0; i<input.length;i++){
            if(input[i]%2 == 0){
                System.out.print(input[i] + " ");
            }
        }
        //홀수 출력
        System.out.print("\n" + "홀수: ");
        for(int i=0; i<input.length;i++){
            if(input[i]%2 != 0){
                System.out.print(input[i] + " ");
            }
        }
    }
}
