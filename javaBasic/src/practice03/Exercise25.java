package practice03;

import java.util.Scanner;

public class Exercise25 {
  public static void main(String[] args){
    //Declaration
    Scanner sc = new Scanner(System.in);
    int input;

    //User Input
    System.out.print("정수를 입력하시오: ");
    input = sc.nextInt();

    for(int i=1; i<10; i++){
      if(i!=input){
        System.out.print(i + " ");
      }
    }
  }
}


