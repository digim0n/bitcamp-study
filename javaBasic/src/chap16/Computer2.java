package chap16;

public class Computer2 {
    private String os;
    private int memory;

    public void show() {
        System.out.println("OS는 " + this.os + "입니다.");
        System.out.println("메모리는 " + this.memory + "GB입니다. ");
    }

    public void setOsMemory(String os, int memory) {
        // 인수값을 필드변수로 설정
        this.os = os;
        this.memory = memory;
    }
}