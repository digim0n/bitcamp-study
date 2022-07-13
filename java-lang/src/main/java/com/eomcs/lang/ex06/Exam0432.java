package com.eomcs.lang.ex06;

// # 흐름 제어문 - for 중첩과 break
//
public class Exam0432 {
  public static void main(String[] args) {
    // break 라벨명;
    loop1: {
      for (int i = 1; i <= 10; i++) {
        for (int j = 1; j <= i; j++) {
          System.out.print(j + " ");
          if (j == 5)
            break loop1; // 라벨로 지정한 문장을 나간다. (루프로 묶은 라벨문) : 가까운 반복문이 아닌 바깥쪽 반복문을 나가고 싶을때 루프로 묶어서 쓴다.
        }
        System.out.println();
      }
      System.out.println("-------------------------");
    }
    System.out.println("loop1 밖!");
  }
}


