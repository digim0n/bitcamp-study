package com.bitcamp.board.dao;

import com.bitcamp.board.domain.Member;
import com.bitcamp.util.LinkedList;

// 회원 목록을 관리하는 역할
//
public class MemberList extends LinkedList {

  // LinkedList의 retrieve()에서 던지는 예외를 이 메서드에서 처리하지 않고
  // 호출자에게 처리를 위임한다.
  // => ListException은 RuntimeException 계열이기 때문에 
  //    메서드 선언부에 표시하지 않아도 된다.
  //    Exception 계열의 예외를 다루는 것 보다 덜 번거롭다.


  //메서드의 이름을 일관성을 위해 수퍼클래스의 메서드 이름에 맞춰 변경한다.
  //
  public Member retrieve(String email) {
    for (int i = 0; i < length(); i++) {
      Member member = (Member) retrieve(i);
      if (member.email.equals(email)) {
        return member;
      }
    }
    return null;
  }

  // LinkedList의 retrieve()에서 던지는 예외를 이 메서드에서 처리하지 않고
  // 호출자에게 처리를 위임한다.
  // => ListException은 RuntimeException 계열이기 때문에 
  //    메서드 선언부에 표시하지 않아도 된다.
  //    Exception 계열의 예외를 다루는 것 보다 덜 번거롭다.
  //
  public boolean delete(String email) {
    for (int i = 0; i < length(); i++) {
      Member member = (Member) retrieve(i);
      if (member.email.equals(email)) {
        return delete(i);
      }
    }
    return false;
  }
}














