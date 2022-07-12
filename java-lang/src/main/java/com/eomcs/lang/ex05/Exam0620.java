package com.eomcs.lang.ex05;

//# 증감 연산자 : 후위(post-fix) 감소 연산자
//
public class Exam0620 {
  public static void main(String[] args) {
    int i = 7;

    i--;
    // 현재 위치에 i 메모리에 들어 있는 값을 꺼내 놓는다. 
    // i 메모리의 값을 1 감소시킨다.
    // 컴파일러는 위의 문장을 다음과 같이 바꾼다.
    // 
    //    int temp = i;
    //    i = i - 1;


    i--;
    // 컴파일러는 위의 문장을 다음과 같이 바꾼다.
    //    int temp = i;
    //    i = i - 1;

    System.out.println(i); // 5

    System.out.println(i--); // 5  요거를 조심하라는거야~~~~~~~~~!!!!!  출력후에 한번더 i--를 줘도 출력하기 전에 값은 5 그대로고 출력하고 나야 4로 줄어드는거다. 임시변수에 들어있는 값은 5이니깐!!!
    // 위의 문장을 컴파일 하면 다음과 같이 바뀐다.
    //    int temp = i;
    //    i = i - 1;
    //    System.out.println(temp);

    System.out.println(i); // 4

  }
}
