package practice04;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise04 {
    public static void main(String[] args){
        //선언
        Scanner sc = new Scanner(System.in);
        int[] input = new int[10];
        int temp;

        //입력
        for(int i=0; i<10; i++){
            System.out.print((i+1) + "번째 숫자를 입력하시오: ");
            input[i] = sc.nextInt();
        }

        //오름차순 정렬
        Arrays.sort(input);

        //출력
        System.out.print("\n 오름차순 출력: ");
        for(int i=0; i<10; i++){
            System.out.print(input[i] + " ");
        }
    }
}
