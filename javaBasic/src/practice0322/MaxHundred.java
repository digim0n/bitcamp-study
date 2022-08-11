package practice0322;

import java.util.Scanner;

public class MaxHundred {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] input = new int[10];
        int total = 0;

        for(int i=0; i<input.length; i++){
            System.out.print((i+1) + " 번째 정수를 입력하시오: ");
            input[i] = sc.nextInt();
            total += input[i];
            if(total > 100){
                break;
            }
        }

        System.out.print("입력된 모든 값을 출력합니다: ");
        for(int i=0; i<input.length; i++){
            if(input[i] == 0){
                break;
            }
            System.out.print(input[i] + " ");
        }
    }
}
