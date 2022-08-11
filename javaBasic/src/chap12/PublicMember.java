package chap12;

class Computer3 {
    private String os;
    private int memory;

    public void show() { // public메소드show
        System.out.println("PC의 OS는 " + os + "입니다.");
        System.out.println("메모리는 " + memory + "GB입니다.");
    }

    public void setOsMemory(String os, int memory) { // public메소드 setOsMemory
        // 설정할 메모리값이 정산인지 확인
        if (memory > 0) {
            // 정상적인 인수값을 필드변수로 설정
            this.os = os;
            this.memory = memory;
            System.out.println("OS를 " + os + "로 메모리를 " + memory + "GB로 변경했습니다. ");
        } else {
            System.out.println("「" + memory + "」는 올바른 메모리크기가 아닙니다.");
        }
    }
}

public class PublicMember {
    public static void main(String[] args) {
        Computer3 com = new Computer3();

        // 다른 클래스의 private변수는 접근할 수 없습니다.
        // com.os = "Windows 11"; // 주석처리
        // com.memory = -5445; // 주석처리

        // 올바른 값을 공식연산을 호출 설정
        com.setOsMemory("Windows 11", 32); // public메소드setOsMemory호출하여 값 설정
        com.show(); // public메소드 show호출

        // 잘못된 값 설정
        System.out.println("\n메모리에 잘못된 값(-5445)를 지정해 봅니다.");
        com.setOsMemory("Windows 10", -5445);
        com.show();
    }
}