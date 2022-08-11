package chap11;

class Person05 {
    String name; // 이름
    int age; // 나이

    // 필드변수의 값을 화면에 메시지로 출력
    public void showPerson() {
        String name = "홍길동";
        int age = 26;
        System.out.println("이 사람의 이름은 " + name + "이고 나이는 " + age + "입니다.");
    }
}

public class Practice0203 {

    public static void main(String[] args) {
        // Person05객체 만들기
        Person05 person = new Person05();

        // 객체에 값 설정
        person.name = "이순신";
        person.age = 32;

        // 메소드에 액세스하여 개별결과를 표시함
        person.showPerson();
    }
}