/*
 * 게시판관리 애플리케이션
 * 비트캠프 20220704
 */
package com.bitcamp.board;

public class App {
  public static void main(String[] args) {

      System.out.println("[게시판 애플리케이션]");
    System.out.println();
     System.out.println("환영합니다!");
    System.out.println();

    // Scanner keyboardinput = new Scanner(System.in);
    java.util.Scanner keyboardInput = new java.util.Scanner(System.in); //-> (1)키보드에서 읽어들일 준비를 하고
    //system.in 은 키보드 system.out은 모니터
    

    final int SIZE = 3;

    int[] no = new int[SIZE];
    String[] title = new String[SIZE];
    String[] content= new String[SIZE];
    String[] writer = new String[SIZE];
    String[] password= new String[SIZE]; //->>노랑색 밑줄되있는거는 아래에서 변수에 대한 설정을 아직 안해줘서 그렇다
    int[] viewCount = new int[SIZE];
    long[] createdDate = new long[SIZE]; //->> 날짜 시간은 long타입으로 다룬다! 문자열로 다루기도 함.
    // String title1 = " " , String title2  = " " , String title3 = " " ,  --> 1000개만들때.......
    //String // ---> 배열문법 배우고...고치자...

   int boardCount = 0; //--->  저장된 게시글의 개수 --> 를 담는 변수  /0부터 시작/현재 영역 -
    

  

    while (true) {  //--> (2) while문으로 반복한다.
    System.out.println("메뉴:");
    System.out.println("  1: 게시글목록");
    System.out.println("  2: 게시글 상세보기");
    System.out.println("  3: 게시글등록");
    System.out.println("\n메뉴를 선택하세요 [1..3](0: 종료)");

    
    int menuNo = keyboardInput.nextInt();   //--> (3)키보드에서 숫자를 입력해야한다. 입력하고 엔터 칠때까지 다음으로 안넘어감 (리턴안해)
    //nextInt 는 
    keyboardInput.nextLine(); //키보드 뒤에 남은 엔터 찌끄레기 버리는 코드 = 입력한 숫자 뒤에 남아있는 줄바꿈 코드제거
    // System.out.println("==>" + menuNo);

   
    System.out.println("----------------------------------");
    if (menuNo == 0) {
      break;  // -> 얘는 while 문이랑 팀이다. // 바로 위에 if문이랑 팀할라면 같이 묶여있었어야함
    } 
    
    else if (menuNo == 1) {
    System.out.println("게시글 목록");
    System.out.println("번호\t 제목\t 조회수\t 작성자\t1 등록일");
     
    //날짜 정보에서 값을 추출하여 특정 포맷의 문자열로 만들어줄 도구를 준비해보자
    java.text.SimpleDateFormat formatter =
      new java.text.SimpleDateFormat ("yyyy-MM-dd");

      for (int i = 0; i < boardCount; i++){
        //밀리초 데이터(1000분의 1초) ==> Date 도구함으로 날짜정보를 설정
        java.util.Date date = new java.util.Date(createdDate[i]); 

        // 날짜 정보를 ==> "yyyy-MM-dd 형식의 문자열로"
        String dateStr = formatter.format(date); 

        System.out.printf("%d\t%s\t%d\t%s\t%s\n",
        no[i],title[i],viewCount[i],writer[i],dateStr);
        
      }

    } else if (menuNo == 2) {
      System.out.println("[게시판 상세보기]");

      System.out.print("조회할 게시글 번호?");
      String input = keyboardInput.nextLine();
      int boardNo = Integer.parseInt(input);
      // int boardNo = keyboardInput.nextInt(); 여기라인 두줄을 위의 두줄로 바꿔서 사용할수 있다.
      // keyboardInput.nextLine();

      //해당번호으 ㅣ게시글이 몇번 배열에 들어있는지 알아내기
      int boardIndex = -1;
      for (int i = 0; i < boardCount; i++) {
        if (no[i] == boardNo) {
           boardIndex = i;  //배열의 위치를 알아내는것을 인덱스라고 한다.
           break;
        }
        
      }
      // 사용자가 입력한 번호에 해당하는 게시글을 못 찾았다면  (--> boardIndex가 만약에 못찾아서 -1의 값이라면)
      if (boardIndex == -1) {
        System.out.println ("해당 번호의 게시글이 없습니다!");
        continue;
      }

      System.out.printf("번호 : %d\n", no[boardIndex]); // -> 주민번호 마냥 식별을위해사용 -자동
      System.out.printf("제목 : %s\n", title[boardIndex]);
      System.out.printf("내용 : %s\n",content[boardIndex]);
      System.out.printf("조회수: %d\n",viewCount[boardIndex]);
      System.out.printf("작성자: %s\n",writer[boardIndex]); // 얘는 "" 없이 표기하는데 변수이다. 위에 리터럴값에 대한 설명이 있
      
      java.util.Date date = new java.util.Date(createdDate[boardIndex]); //-> 데이트도구함을 쓸건데 java.util 패키지 아래에 있는 Date/기준값(기준데이터)을 구해야 하는데...요게 그 커맨드
      // Date date
      // =>  createdDate밀리초를 가지고 설정한 날짜정보
       //Date 도구함의 도구를 쓸수있도록 데이터를 준비시킨다.
      //new Date (밀리초)
      // => 지정한 밀리초를 가지고 날짜 관련 도구를 사용할수 있도록 설정한다.
      //Date 도구함을 통해 설정한 날짜정보를 가지고 printf()를 실행한다.
      
      System.out.printf("등록일: %tY-%1$tm-%1$td %1$tH:%1$tM\n", date);  // 얘는 ""안의 값으로 표기해놨었는데 "" 요안에 값을 입력하면 변수이고 얘가 콘솔창에 바로나온다. // %1 뜻은 첫번째값

    } else if (menuNo == 3) {
      System.out.println("[게시글 등록]");

      //배열의 크기를 초과하지 않았는지 아래 if문과 함께 검사해보자
      if (boardCount == SIZE) {
        System.out.println("게시글을 더이상 저장할수 없습니다.");
        continue;
      }
      
      System.out.print("제목?");
      title[boardCount] = keyboardInput.nextLine();  //요 라인이 사용자가 제목 입력하고 엔터 치면 엔터버리고 리턴한다.-->키보드 값을 유니코드로 변환해서 리턴한다.

      System.out.print("내용?");
      content[boardCount] = keyboardInput.nextLine();

      System.out.print("작성자?");
      writer[boardCount] = keyboardInput.nextLine();

      System.out.print("암호?");
      password[boardCount] = keyboardInput.nextLine();

      // if (boardCount == 0) {
      //   no[boardCount] =1;
      // } else {
      //   no[boardCount] = no[boardCount-1]+1; // 게시글번호
      // }
      no[boardCount] = boardCount == 0 ? 1 : no[boardCount -1] +1;
      
      viewCount[boardCount]= 0 ;
      createdDate[boardCount] = System.currentTimeMillis();

      boardCount++;  // 배열은 인덱스가 0부터 시작하기 때문에 0라인이 끝날때 ++을 추가하여 카운트를 올려준다. // 그다음 배열의 인덱스를 가르킴. //위에서 보드카운트0으로 시작했고 그때문에 라인 스타트라인에 이 코드 삽입하면 0부터가 아니라 1부터 시작된다.

    } else {
      System.out.println("메뉴번호가 옳지 않습니다.!!");
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