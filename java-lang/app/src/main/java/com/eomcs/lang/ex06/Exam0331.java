package com.eomcs.lang.ex06;

//# 흐름 제어문 - 중첩된 반복문 탈출
//
public class Exam0331 {
  public static void main(String[] args) {
    int x = 2, y = 1;

    // 라벨명: 반복문1 { 반복문2 {break 라벨명;}}
    // 라벨 문법:
    //      라벨: 문장;
    //      라벨: {문장1, 문장2, ...}

    myloop:  
      while (x <= 9) {

        while (y <= 9) {
          System.out.printf("%d * %d = %d\n", x, y, x * y);
          if (x == 5 && y == 5)  // ---> x가 5이고 y가 5이면 트루 ==> 나간다.
            break myloop; // myloop 라벨에 소속된 문장을 나간다.
          y++;
        }

        System.out.println();
        x++;
        y = 1;
      }
    System.out.println("종료!!");

    System.out.println("-----------------------------");
  }
}

// 여러개의 문장을 라벨로 묶어서 관리하고 싶으면 ???? 중괄호 써라
//라벨없이 브레이크 하면 자기가 소속된라벨을 나가버리는것.
//현재 반복문이 아닌 바깥쪽 반복문을 나가고 싶으면 브레이크하고 라벨명을 줘버려라.
