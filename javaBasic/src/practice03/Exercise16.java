package practice03;

import java.util.Scanner;

public class Exercise16 {
  public static void main(String[] args){
    //선언
    Scanner sc = new Scanner(System.in);

    int input;

    System.out.println("정수를 입력하세요!");
    input = sc.nextInt();

    if(input>=0 && input<=10) {
      System.out.println("ok");  

    }
  }
}
