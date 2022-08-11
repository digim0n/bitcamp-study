package chap11;

class Computer3 {
    String os;
    int memory;
}

public class ManyObjects {
    public static void main(String[] args) {
        // 같은 Computer3 클래스에서 2개의 객체를 생성함
        Computer3 com1 = new Computer3();
        Computer3 com2 = new Computer3();

        // 개별 객체의 필드변수에 각 데이터를 저장함
        com1.os = "Windows 11";
        com1.memory = 32;
        com2.os = "Windows 10";
        com2.memory = 16;

        // 개별 객체의 필드변수값을 참조하고 결과를 화면에 표시
        System.out.println("PC1의 OS는 " + com1.os + "입니다.");
        System.out.println("메모리 크기는 " + com1.memory + "GB 입니다.");
        System.out.println("PC2의 OS는 " + com2.os + "입니다.");
        System.out.println("메모리 크기는 " + com2.memory + "GB 입니다.");
    }
}