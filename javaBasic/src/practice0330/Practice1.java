package practice0330;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numClass;

        System.out.print("학급수: ");
        numClass = sc.nextInt();
        int[] stuNum = new int[numClass];
        int[] aveClass = new int[numClass];

        for(int i=0; i<numClass; i++){
            System.out.print((i+1) + "반의 학생수: ");
            stuNum[i] = sc.nextInt();

            int[][] stuScore = new int[numClass][10];
            for(int j=0; j<stuNum[i]; j++){
                System.out.print((i+1)+"반"+(j+1)+"번의 점수: ");

            }

        }
    }

}
