/*
 * 사용자로부터 키보드 입력을 받는 일을 한다. 키보드 입력을 받는 도구를 구비하고 있다.
 * 비트캠프-20220714
 */
package com.bitcamp.board;

public class Prompt {
  
 
  static java.util.Scanner keyboardInput = new java.util.Scanner(System.in);

  static int inputInt() {
    String str = keyboardInput.nextLine();
    return Integer.parseInt(str); // parseInt가 하는일 "123" == 123,"5"==5, "ok"==실행오류
    //

  }
  static int inputInt(String title) {
    System.out.print(title); // title 값을 출력해
    String str = keyboardInput.nextLine();
    return Integer.parseInt(str); 
    //

  }

static String inputString() {
  return keyboardInput.nextLine();
}

static String inputString(String title) {  // 파라미터는 타입을 알려줘야한다.
  System.out.print(title);// title 값을 출력해
  return keyboardInput.nextLine();
}  
//클래스를 다쓰고 난다음 닫게하는것
static void close() {
    keyboardInput.close();
 }
} 
