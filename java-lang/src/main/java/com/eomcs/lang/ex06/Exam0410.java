package com.eomcs.lang.ex06;

//# 흐름 제어문 - for 반복문  --> for문은 배열의 인덱스를 다루기에 아주 좋다.
//
public class Exam0410 {
  public static void main(String[] args) {
    // for (변수선언 및 초기화; 조건; 증감문) 문장;
    // for (변수선언 및 초기화; 조건; 증감문) {문장1; 문장2; ...}

    // for 문의 전형적인 예
    for (int i = 1; i <= 5; i++)
      System.out.println(i);
    // 실행 순서
    // 1) 변수초기화  => int i = 1 --> 값을 초기화 1부터 시작
    // 2) 조건 => i <= 5
    // 3) 문장 => System.out.print(i + " ")
    // 4) 변수증가문 => i++ 요거는 실행하고 나서 증가
    // 조건이 참인 동안 2 ~ 4를 반복한다.

    // for 문에서 선언한 변수는 그 for 문 안에서만 사용할 수 있다. for 문완료한다음엔 쓸수가 없어 6부터는 에러.
  System.out.println(i); // 컴파일 오류!
  }
}
