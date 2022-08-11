package practice03;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        //Declaration
        Scanner sc = new Scanner(System.in);
        int[] input = new int[5];
        int total = 0;

        //User Input
        for(int i=0; i<input.length; i++){
            System.out.print((i+1) + "번째 숫자를 입력하시오: ");
            input[i] = sc.nextInt();
            total += input[i];
        }
        System.out.println("모든 정수의 합은 = " + total);
    }
}
