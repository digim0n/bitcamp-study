package chap12;

class Computer1 {
    String os;
    int memory;

    public void show() {
        System.out.println("PC의 OS는 " + os + "입니다.");
        System.out.println("메모리는 " + memory + "GB입니다.");
    }
}

public class DirectAccessObjectVariable {
    public static void main(String[] args) {
        Computer1 com = new Computer1();

        com.os = "Windows 11"; // 필드변수 os(맴버변수)에 직접 액세스하고 할당함
        com.memory = 32; // 필드변수 memory(맴버변수)에 직접 액세스하고 할당함

        com.show();
    }
}
