package practice04;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args){
        //선언
        int[][] kukuDan = new int[9][9];
        Scanner sc = new Scanner(System.in);
        int a, b;

        //구구단 array 생성
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                kukuDan[i][j] = (i + 1) * (j + 1);
            }
        }

        //User Input
        System.out.print("1번째 숫자를 입력하시오: ");
        a = sc.nextInt();
        System.out.print("2번째 숫자를 입력하시오: ");
        b = sc.nextInt();

        //출력
        System.out.println(a + " x " + b + " = " + kukuDan[a-1][b-1]);

    }
}
