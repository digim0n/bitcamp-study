package practice03;

import java.util.Scanner;

public class Exercise34 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int input;

    System.out.print("정수를 입력하시오: ");
    input = sc.nextInt();

    if(input <0){
      input = -1 * input;
      System.out.println("Result = " + input);
    }else{
      System.out.println("Result = " + input);
    }
  }
}
