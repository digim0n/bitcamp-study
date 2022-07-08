/*
 * 게시판관리 애플리케이션
 * 비트캠프 20220704
 */
package com.bitcamp.board;

public class App {
  public static void main(String[] args) {

    System.out.println("[게시판 애플리케이션]");
    System.out.println("\n환영합니다!\n");

      System.out.println("[게시판 애플리케이션]");
    System.out.println();
     System.out.println("환영합니다!");
    System.out.println();

    // Scanner keyboardinput = new Scanner(System.in);
    java.util.Scanner keyboardInput = new java.util.Scanner(System.in);
    //system.in 은 키보드 system.out은 모니터
    
    while (true) {
    System.out.println("메뉴:");
    System.out.println("  1: 게시글목록");
    System.out.println("  2: 게시글 상세보기");
    System.out.println("\n메뉴를 선택하세요 [1..2](0: 종료)");

    
    int menuNo = keyboardInput.nextInt();
    //키보드 뒤에 남은 엔터 찌끄레기 버리는 코드 = 입력한 숫자 뒤에 남아있는 줄바꿈 코드제거
    keyboardInput.nextLine();
    // System.out.println("==>" + menuNo);

    
    if (menuNo == 0) {
      
      break;
    } else if (menuNo == 1) {
      System.out.println("게시글 목록");

      System.out.println("번호 제목 조회수 작성자 등록일");
      System.out.print("1");
      System.out.print("\t");
      System.out.print("제목입니다1");
      System.out.print("\t");
      System.out.print(20 + "\t");
      System.out.print("홍길동\t");
      System.out.print("2022-07-08\r\n");


      System.out.print(2 +"\t"+"제목입니다2\t"+ 11 + "\t"+ "박길동\t"+ "2022-07-08\n");
      System.out.println(3 +"\t"+"제목입니다2\t"+ 11 + "\t"+ "임길동\t"+ "2022-07-08");
      System.out.printf("%d\t%s\t%d\t%s\t%s\n",
        4,"제목입니다4",45,"유관순","2022-07-08");
    }
    else {
      if (menuNo == 2) {
        System.out.println("게시판 상세보기");

        System.out.printf("번호 : %d\n",1);
        System.out.printf("제목 : %s\n","제목입니다1.");
        System.out.printf("내용 : %s\n","내용입니다");
        System.out.printf("조회수: %d\n",100);
        System.out.printf("작성자: %s\n","홍길동");
        System.out.printf("등록일: %s\n","2022-07-08"); 
      } else {
        System.out.println("메뉴번호가 옳지 않습니다.!!");
      }
      }
    }
    System.out.println ("안녕히가세요!");
    keyboardInput.close();
  }
}

/* int a;
        a = keyboardinput.nextInt()*/ 
        //  int a;
       // a = keyboardinput.nextInt()  a 변수 뒤에 있는거 익스프레션 (할당연산자를 중심으로 왼편에는 변수 오른편에는 리터럴오거나 변수 오거나 익스프레션 올수있다.
       //문장을 실행후에 결과를 리턴하는 명령문을 익스프레션이라고 한다. 
       //익스프레션은 키보드로부터 인트값을 받은 다음에 a 뒤에 값을 놓는다 a = 리턴값 요렇게)
       //변수명은 항상 소문자로 시작하고 카멜케이스를 쓴다.

       //int menuNo;
        // menuNo keyboardInput.nextInt();

//사용자로부터 입력받게 -- 입력처리하기//
//scanner keyboardinput = nes scanner(System.in); 요게 코드

//java.unit.Scanner 스캐너는 어떤패키지 밑에있다는건지 !!!!! (자바.유닛) 밑에 있다 걍 외우세요 근데 나중엔 input 변수선언해서 이거 안써도댐//

  //여기까지 키보드 썼으니 닫아준다. 밑에가 코드이고 한번 닫으면 재사용 불가. new 써서 새로 코딩 또해야댐 근데 닫아줘야함.
 // keyboardInput.close();