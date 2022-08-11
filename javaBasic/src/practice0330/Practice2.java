package practice0330;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        int[][] score = new int[6][2];
        Scanner sc = new Scanner(System.in);
        double[] stuAverage = new double[6];
        double korAverage, mathAverage;
        int korTotal=0, mathTotal=0;

        System.out.println("6명의 국어, 수학 점수를 입력하세요.");
        for(int i=0; i<6; i++){
            for(int j=0; j<2; j++){
                System.out.print((i+1) + "번");
                if(j==0){
                    System.out.print(" 국어: ");
                    score[i][j] = sc.nextInt();
                }else{
                    System.out.print(" 수학: ");
                    score[i][j] = sc.nextInt();
                }
            }
        }

        for(int i=0; i<6; i++){
            stuAverage[i] = ((double)score[i][0] + (double)score[i][1]) / 2.0;
            korTotal += score[i][0];
            mathTotal += score[i][1];
        }
        korAverage = (double)korTotal / 6.0;
        mathAverage = (double)mathTotal / 6.0;

        System.out.println("No. 국어  수학  평균");
        for(int i=0; i<6; i++){
            System.out.print((i+1) + "   " + score[i][0] + "   " + score[i][1] + "   ");
            System.out.printf("%.1f", stuAverage[i]);
            System.out.println();
        }
        System.out.printf("평균  %.1f  %.1f", korAverage, mathAverage);
    }
}
