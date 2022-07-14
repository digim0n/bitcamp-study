package com.eomcs.lang.ex05;

//# 증감 연산자 : 후위(post-fix) 증감 연산자 응용 II
//
public class Exam0640 {
  public static void main(String[] args) {
    int i = 2;
    int result = i++ + i++ * i++;
    // 연산자 우선수위: 
    // 1) ++, -- 
    // 2) *, /, %
    // 3) +, -
    // 4) =
    // 
    // int result = 2 + i++ * i++;  => i = 3
    // int result = 2 + 3 * i++; => i = 4
    // int result = 2 + 3 * 4; => i = 5
    // int result = 2 + 12;
    // int result = 14;
    System.out.printf("%d, %d\n", i, result);

  }
}
//곱하기 더하기보다 먼저 대입한다음에 시행하는거야₩!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!
//후위연산자가 우선순위니까 바꿔놓고 시작하라고 1@!@!@!@!@!