package com.eomcs.lang.ex05;

//# 논리 연산자 : &, |
//
public class Exam0320 {
  public static void main(String[] args) {
    // AND 연산자
    // - 두 개의 논리 값이 모두 true일 때 결과가 true가 된다.
    System.out.println(true & true);
    System.out.println(true & false);
    System.out.println(false & true);
    System.out.println(false & false);

    System.out.println("-----------------------");

    // OR 연산자
    // - 두 개의 논리 값 중 한 개라도 true이면 결과는 true가 된다.
    System.out.println(true | true);
    System.out.println(true | false);
    System.out.println(false | true);
    System.out.println(false | false);

  }
}
// && 연산은 둘다 TRUE여야만 true 자나 앞에 있는게 벌써 false 나오면 예상 가능하니까 뒤에 계산 안한다.
// 근데 &연산의 경우 왼쪽 값으로 결과 예측 되도 상관없이 오른쪽 문장 무조건 무조건 실행한다. 왜냐면 바뀔수 있으니깐
