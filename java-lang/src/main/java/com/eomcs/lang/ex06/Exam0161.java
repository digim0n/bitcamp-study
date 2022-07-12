package com.eomcs.lang.ex06;

import java.util.Scanner;

//# 흐름 제어문 - if ~ else if ~ else if ~ else
//
public class Exam0161 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("나이를 입력하세요? ");
    int age = keyScan.nextInt();

    // if ~ else ~는 한 문장이기 때문에
    // if ~ else ~ 만 있다면 블록으로 묶지 않아도 된다. 
    if (age < 8)
      System.out.println("아동입니다.");
    else
      if (age < 14)
        System.out.println("어린이입니다.");
      else 
        if (age < 19)
          System.out.println("청소년입니다.");
        else
          if (age < 65)
            System.out.println("성인입니다.");
          else
            System.out.println("노인입니다.");

    keyScan.close();
  }
}
//if else는 한문장 !!!if else는 한팀 !!!

// 너무 지저분하니깐 조정해서 나온거지 else if 라는 문법이 있는건 아니다 !@!@!@!@