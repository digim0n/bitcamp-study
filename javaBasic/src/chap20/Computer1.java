package chap20;

public class Computer1 {
    private String  os;
    private int    memory;

    // 생성자 (인수없음)
    public Computer1(){
        this.os = null;
        this.memory = 0;
        System.out.println("PC를 만들었습니다.");
    }
    // 생성자 (인수있음)
    public Computer1(String os, int memory){
        this.os = os;
        this.memory = memory;
        System.out.println("OS는 " + os + "이고, 메모리크기는 " + memory + "GB의 PC를 만들었습니다.");
    }
    public void setOsMemory(String os,int memory){
        this.os = os;
        this.memory = memory;
        System.out.println("OS는 " + os + "와 메모리는 " + memory + "GB로 변경했습니다.");
    }

    public void show(){
        System.out.println("PC의 OS는 " + os + "입니다.");
        System.out.println("메모리크기는 " + memory + "GB입니다.");
    }
}
