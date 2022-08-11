package practice0322;

import java.util.Scanner;

public class CalcAverage {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] input = new int[10];
    int total = 0;
    int average;
    int i =0;
    System.out.println("정수를 10번 입력하시오: ");

    for (i=0; i<input.length;i++) {
      input[i] = sc.nextInt();
      total += input[i];
    }
    System.out.println("total:" + total);
  }
}
//10개의 정수를 입력받는다.
//정수 10개의 평균을 구한다.
//평균을 출력한다.


