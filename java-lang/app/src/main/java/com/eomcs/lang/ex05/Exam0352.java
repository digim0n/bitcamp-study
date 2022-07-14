package com.eomcs.lang.ex05;

//# 비트 연산자 & 를 이용하여 % 연산 구현하기 응용 I
//
public class Exam0352 {
  public static void main(String[] args) {
    // % 연산자를 이용하여 짝수/홀수 알아내기
    System.out.println(57 % 2 == 0 ? "짝수" : "홀수");

    // & 연산자를 이용하여 짝수/홀수 알아내기
    System.out.println((57 & 0x1) == 0 ? "짝수" : "홀수");  //=> 57에서 맨끝에 1비트를 추출한 값이 나머지가 0인가? 맞으면 짝수 
    //만약 0x3이면 맨끝에 3비트를 추출해서 8로나눈 나머지값이 0이면 짝수이다 아니면 홀수이다 이렇게 해석해야 한다.
    

  }
}

