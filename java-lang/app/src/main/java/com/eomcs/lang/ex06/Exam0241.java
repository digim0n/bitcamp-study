package com.eomcs.lang.ex06;

//# 흐름 제어문 - switch 문법 II
//
public class Exam0241 {

  public static void main(String[] args) {
    int level = 1;

    // 상수를 사용하면 주석없이 바로 이해할 수 있다.
    // => case는 문자의 값이야~!@ 변수로써 사용할 수 없다. ! 
    // => 단 값이 변경되지 않는 final 변수라면 사용할 수 있으니까 그거써라~!!@!@!@
    //
    final int GUEST = 0, MEMBER = 1, ADMIN = 2;

    switch (level) {
      case GUEST:
        System.out.println("조회만 가능합니다.");
        break;
      case MEMBER:
        System.out.println("글작성 가능합니다.");
        break;
      case ADMIN:
        System.out.println("다른 회원의 글을 변경, 삭제할 수 있습니다.");
        break;
    }
  }
}

//Fianl 은 값을 증명해야돼,  근데 이 넘이라는게 잇음 enum 근데 신경쓰지마 아직은 
//sldkfjsdlkfjdslkfj