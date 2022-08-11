package practice04;

import java.util.Scanner;

public class Exercise01 {
    public static void main (String[] args){
        //선언
        Scanner sc = new Scanner(System.in);
        int[] input = new int[10];

        //입력
        for(int i=0; i<10; i++){
            System.out.print((i+1) + "번째 숫자를 입력하시오: ");
            input[i] = sc.nextInt();
        }

        //출력
        System.out.print("거꾸로 출력: ");
        for(int j=9; j>=0; j--){
            System.out.print(input[j] + " ");
        }
    }
}
