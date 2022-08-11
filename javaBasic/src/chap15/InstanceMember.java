package chap15;

class Computer1 {
    private String os; // 인스턴스변수
    private int memory; // 인스턴스변수

    public Computer1() { // 생성자
        this.os = null;
        this.memory = 0;
        System.out.println("PC를 만들었습니다.");
    }

    public void setOsMemory(String os, int memory) { // 인스턴스 메소드
        this.os = os;
        this.memory = memory;
        System.out.println("OS는 " + os + "이고 메모리는 " + memory + "GB로 변경합니다. ");
    }
    public void show() { // 인스턴스 메소드
        System.out.println("PC의 OS는 " + os + "입니다.");
        System.out.println("메모리는 " + memory + "GB입니다.");
    }
}

public class InstanceMember {
    public static void main(String[] args) {
        Computer1 com1 = new Computer1(); // com1객체 생성 (인스턴스 생성)
        com1.setOsMemory("Windows 11", 64); // com1객체의 setOsMemory메소드 호출
        com1.show(); // com1객체의 show메소드 호출
        System.out.println("============================================================");
        Computer1 com2 = new Computer1(); // com2객체 생성 (인스턴스 생성)
        com2.setOsMemory("Windows 10", 16); // com2객체의 setOsMemory메소드 호출
        com2.show(); // com2객체의 show메소드 호출
    }
}