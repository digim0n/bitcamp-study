package practice03;

import java.util.Scanner;

public class Exercise29 {
  public static void main(String[] args){
    //Declaration
    int[] arr = {3, 7, 0, 8, 4, 1, 9, 6, 5, 2};
    Scanner sc = new Scanner(System.in); //생
    int input;//선


    //User Input
    System.out.print("정수를 입력하시오: " );
    input = sc.nextInt();

    System.out.println("Result = " + arr[arr[input]]);
  }
}

//정수를 입력하시오: 4
//result= 4