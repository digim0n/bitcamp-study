package chap11;

class Computer4 {
    String os;
    int memory;

    public void show() {
        System.out.println("PC의 OS는 " + os + "입니다.");
        System.out.println("메모리 크기는 「" + memory + "GB입니다.");
    }
}

public class InstanceMethod1 {
    public static void main(String[] args){
        //Class
        Computer4 com = new Computer4();

        System.out.println("* 1번째 메소드 호출");
        com.show();

        com.os = "Windows 11";
        com.memory = 32;

        System.out.println("\n* 2번째 메소드 호출");
        com.show();
    }
}
