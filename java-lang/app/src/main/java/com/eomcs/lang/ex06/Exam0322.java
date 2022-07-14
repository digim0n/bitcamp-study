package com.eomcs.lang.ex06;

//# 흐름 제어문 - break와 continue 활용
//
public class Exam0322 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;

    // 1부터 100까지의 카운트를 하는데 단 합은 50까지만 계산한다.
    // => break 사용 전
    count = 0;
    sum = 0;
    while (count < 100) {   // --> 0부터 99까지 가야되는 상황일때 
      count++;  //--> 카운트가 50까지는 합하고
      if (count > 50) // 50을 넘어가면 합을 수행하지 않지만 100까지 계속 컨디뉴한다 조건문으로 가기를 반복한다.
        continue;
      sum += count;
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);

    System.out.println("------------------------");

    // => break 사용 하면 위꺼보다 더 깔끔하다.
    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if (count > 50)
        break; // 즉시 반복문을 종료하고 나가버려서 깔끔스트다.
      sum += count;
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);

  }
}
