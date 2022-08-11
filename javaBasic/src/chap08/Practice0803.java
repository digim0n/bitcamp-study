package chap08;

import java.util.Scanner;

public class Practice0803 {
    public static void main(String[] args){
        //선언, 초기화
        Scanner sc = new Scanner(System.in);
        int[] input = new int[5];
        int total = 0;

        //유저 input 및 계산
        for(int i = 0; i < input.length; i++){
            System.out.print((i+1) + "번째 숫자 입력: ");
            input[i] = sc.nextInt();
            total += input[i];
        }

        //결과 출력
        System.out.println("===================");
        System.out.println("합계 = " + total);
        System.out.println("평균 = " + ((double)total / (double)input.length));
    }
}