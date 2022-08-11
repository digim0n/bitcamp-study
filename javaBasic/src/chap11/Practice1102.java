package chap11;

class Person04 {
    String name; // 이름
    int age; // 나이

    // 필드 변수의 값을 화면에 메시지로 출력
    public void showPerson() {
        System.out.println("이 사람의 이름은 " + this.name + "이고, 나이는 " + this.age + "입니다.");
    }
}

public class Practice1102 {
    public static void main(String[] args) {
        // Person04객체만들기
        Person04 person = new Person04();

        // 객체에 값 전달
        person.name = "김재우";
        person.age = 44;

        // 객체변수에 null대입
        //person = null;

        // 메소드에 액세스하여 개별결과를 표시함
        person.showPerson();
    }
}
