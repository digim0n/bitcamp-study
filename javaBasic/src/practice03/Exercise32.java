package practice03;

import java.util.Scanner;

public class Exercise32 {
  public static void main(String[] args){
    int input1, input2;
    Scanner sc = new Scanner(System.in);

    //User Input
    System.out.print("첫번째 정수를 입력하시오: ");
    input1 = sc.nextInt();
    System.out.print("두번째 정수를 입력하시오: ");
    input2 = sc.nextInt();

    System.out.println(input1 + " + " + input2 + " = " + (input1+input2));
    System.out.println(input1 + " - " + input2 + " = " + (input1-input2));
    System.out.println(input1 + " * " + input2 + " = " + (input1*input2));
    System.out.println(input1 + " / " + input2 + " = " + (input1/input2));
    System.out.println(input1 + " % " + input2 + " = " + (input1%input2));
  }
}


//첫번째 정수입력 : 2
//두번째 정수입력 :2

//2+2=4
//2-2=0
//2*2=4
//2/2=1
//0