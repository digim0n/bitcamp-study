package com.eomcs.lang.ex06;

//# 흐름 제어문 - 중첩된 반복문 탈출
//
public class Exam0330 {
  public static void main(String[] args) {
    int x = 2, y = 1;

    // 5 * 5 까지만 출력하라!
    //
    while (x <= 9) {   //----> 요거 구구단 계산하는거임 

      while (y <= 9) { // -> y 가 9까지 반복하는것 y가 증가하면서 반복한다. 
        System.out.printf("%d * %d = %d\n", x, y, x * y);
        if (x == 5 && y == 5)   // ---> 5x5 나오면 와일문 나가라
          break; // 이 break는 자신이 소속된 가장 가까운 반복문을 나간다.
        y++;
      }

      System.out.println();
      x++;   // --> x 는 6단을 출력한다.
      y = 1;
    }
    System.out.println("종료!!");
  }
}
// 만약에 5x5 하고 나서 6단 안나오게 브레이크 해버리고 싶으면 다음예제를 보자

//push test