package practice0322;

import java.util.Scanner;

public class NumDouble {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] input = new int[10];

        for(int i=0; i<input.length; i++){
            System.out.print((i+1) + " 번째 정수를 입력하시오: ");
            input[i] = sc.nextInt();
            input[i] *= 2;
        }

        System.out.print("입력한 숫자의 2배의 값은: ");
        for(int i=0; i<input.length; i++){
            System.out.print(input[i] + " ");
        }
    }
}
