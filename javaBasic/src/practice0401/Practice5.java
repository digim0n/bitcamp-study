package practice0401;
import java.util.HashSet;

public class Practice5 {

    public static void main(String[] args) {
        // 그룹 결성
        HashSet<Member> group = new HashSet<Member>();
        // 회원 추가
        group.add( new Member( 1 , "홍길동" ));
        group.add( new Member( 2 , "이순신" ));
        group.add( new Member( 3 , "연개소문" ));
        group.add( new Member( 4 , "광개토대왕" ));
        group.add( new Member( 5 , "세종대왕" ));
        // 임시 멤버로 추가!
        group.add( new Member( 1 , "김재우" ));
        // 멤버 소개
        for (Member member : group) {
            System.out.println(member);
        }
    }
}
// 멤버 클래스는 불완전합니다.
class Member {
    private int id; // ID
    private String name; // 이름
    // 생성자
    public Member( final int id, final String name) {
        this.id=id;
        this.name=name;
    }
    @Override
    public String toString() {
        return "ID:" + id + " NAME:" + name;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof Member)) {
            return false;
        }
        return this.id == ((Member)obj).id; //id가 같으면 동일한값으로 간주
    }
    @Override
    public int hashCode() {
        return id;
    }
}

