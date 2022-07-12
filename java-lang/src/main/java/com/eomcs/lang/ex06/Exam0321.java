package com.eomcs.lang.ex06;

//# 흐름 제어문 - break와 continue 활용
//
public class Exam0321 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;


    // 1부터 100까지의 짝수의 합은?
    // => continue 사용 전
    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if ((count & 1) == 0) { // count & 1 ==> count & 0x01 ==> count % 2 //// ---> 카운트의 맨끝 1비트 값이 0이면짝수이다.
        sum += count;    // 그럼 합쳐라
      }
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);

    System.out.println("------------------------");

    // => continue 사용 후
    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if (count % 2 == 1)
        continue; // 다음 문장을 실행하지 않고 즉시 조건 검사로 이동한다. --> 값을 합쳐라 근데 홀수라면 건너뛰고 넘어가-
    }  // 컨디뉴 -> 밑으로가지말고조건문으로돌아가라
    sum += count;
    System.out.printf("count=%d, sum=%d\n", count, sum);
  }
}
