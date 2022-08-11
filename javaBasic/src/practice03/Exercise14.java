package practice03;

import java.util.Scanner;

public class Exercise14 {
  public static void main(String[] args){
    //Declaration
    Scanner sc = new Scanner(System.in);
    int[] input = new int[2];
    int result;

    for(int i=0; i < input.length; i++){
      System.out.print((i+1) + "번째 숫자 입력: ");
      input[i] = sc.nextInt();
    }

    result = (input[0] / input[1]) * input[1];
    System.out.println(input[0] + " / " + input[1] + " * " + input[1] + " = " + result);
  }
}


