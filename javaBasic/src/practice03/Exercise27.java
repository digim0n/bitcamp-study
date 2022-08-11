package practice03;


import java.util.Scanner;

public class Exercise27 {
  public static void main(String[] args){
    //Declaration
    int[] arr = {3, 7, 0, 8, 4, 1, 9, 6, 5, 2};
    Scanner sc = new Scanner(System.in);
    int input;

    //User Input
    System.out.print("1 ~ 9 사이의 정수를 입력하시오: ");
    input = sc.nextInt();

    System.out.println("입력한 요소의 배열 값은 = " + arr[input]);

  }
}

//"1~9 입력하시오" : 3

//asd