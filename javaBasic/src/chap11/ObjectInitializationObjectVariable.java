package chap11;

class Computer8 {

    String os;
    int memory;

    // 필드변수의 값을 표시하는 메소드
    public void show() {
        System.out.println("OS는 " + this.os + "입니다.");
        System.out.println("메모리는 " + this.memory + "GB입니다.");
    }
}

public class ObjectInitializationObjectVariable {

    public static void main(String[] args) {
        // Computer8형 객체변수 com1을 선언하고 객체 생성
        Computer8 com1 = new Computer8();

        // com1객체으 ㅣ각 값설정
        com1.os = "Windows 11";
        com1.memory = 32;

        // Computer8형의 객쳅변수 com2를 선언과 동시에 다른 변수로 초기화
        Computer8 com2 = com1;
        System.out.println("com2에 com1을 할당합니다\n");

        // com1의 show메소드에 액세스
        System.out.print("com1 PC \n");
        com1.show();

        // com의 show메소드에 액세스
        System.out.print("com2 PC \n");
        com2.show();
    }
}