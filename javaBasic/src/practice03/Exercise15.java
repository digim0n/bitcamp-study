package practice03;

import java.util.Scanner;

public class Exercise15 {
  public static void main(String[] args){
    //Declaration
    Scanner sc = new Scanner(System.in); // 스캐너클래스 생성하는데, 아규먼트를 system.in = 콘솔창 안에 입력.
    int input;

    //User Input 
    System.out.print("정수를 입력하시오: ");
    input = sc.nextInt();

    if((input>5) && (input<20)){
      System.out.println("OK");
    }
  }
}


//Scanner 클래스의 넥스트 인트를 쓸거다.
//근데 시스템인(콘솔창에서 입력) 쓸거다.





