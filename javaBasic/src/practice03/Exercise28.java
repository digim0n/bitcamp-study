package practice03;

import java.util.Scanner;

public class Exercise28 {
  static int multTwoNum(int[] arr, int[] element){
    return arr[element[0]] * arr[element[1]];
  }

  public static void main(String[] args){
    //Declaration
    int[] arr = {3, 7, 0, 8, 4, 1, 9, 6, 5, 2};
    Scanner sc = new Scanner(System.in);
    int[] inputElement = new int[2];
    int result;

    //User Input
    for(int i=0; i<inputElement.length; i++){
      System.out.print((i+1) + "번째 요소수를 입력하시오: ");
      inputElement[i] = sc.nextInt();
    }

    //Calc
    result = multTwoNum(arr, inputElement);
    System.out.println("Result = " + result);
  }
}

//1번째요소수를 입력하시오 : 