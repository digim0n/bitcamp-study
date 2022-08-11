package chap11;

class Computer2 {

    String os;
    int memory;
    int ssd;
}

public class FieldVariable {
    public static void main(String[] args) {

        Computer2 com = new Computer2();

        com.os = "Windows 11";
        com.memory = 32;
        com.ssd = 512;

        System.out.println("컴퓨터 OS은 " + com.os + " 입니다.");
        System.out.println("메모리 크기는 " + com.memory + "GB 입니다.");
        System.out.println("SSD 메모리 크기는 " + com.ssd + "GB 입니다.");
    }
}