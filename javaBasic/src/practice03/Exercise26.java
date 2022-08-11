package practice03;

import java.util.Scanner;

public class Exercise26 {
  public static void main(String[] args){
    //Declaration
    Scanner sc = new Scanner(System.in);
    int input;

    //User Input
    System.out.print("정수를 입력하시오: ");
    input = sc.nextInt();

    for(int i=1; i<10; i++){
      if((i!=input) ||(i!=(input+1))){
        System.out.print(i + " ");
      }
    }
  }
}


//Scanner sc = new Scanner(System.in);
//콘솔창에서 입력을 받는 스캐너 객체를 생성한다.
//그리고 sc 인스턴스를 사용해서 콘솔창에서 입력을 받는다.
//그리고 그것을 원하는 변수에 저장할수 있다.
//input 변수로 정했다. (정수)

//sc는 레퍼런스 변수 스캐너객체를담는다
//sc. 치면 스캐너에 있는 메소드가 뜬다.

//정수를 입력하시오: 7
//1 2 3 4 5 6 8 9 