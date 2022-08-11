package chap15;

class Computer2 {
    private String os; // 인스턴스 변수
    private int memory; // 인스턴스 변수
    public static int sum; // 클래스 변수

    // 생성자
    public Computer2() {
        this.os = null;
        this.memory = 0;
        sum++;
        System.out.println("PC를 만들었습니다.");
    }
    public void setOsMemory(String os, int memory) { // 인스턴스 메소드
        this.os = os;
        this.memory = memory;
        System.out.println("OS는 " + os + "이고 메모리는 「" + memory + "GB로 변경했습니다.");
    }
    public void show() { // 인스턴스 메소드
        System.out.println("PC의 OS는 " + os + "입니다.");
        System.out.println("메모리는 " + memory + "GB입니다.");
    }
    public static void showSum() { // 클래스 메소드
        System.out.println("PC 제작된 갯수는 " + sum + "대입니다.");
    }
}

public class ClassMember {
    public static void main(String[] args) {
        Computer2.sum = 0; // 클래스 변수 sum에 액세스하고 0으로 초기화
        Computer2.showSum(); // 클래스 메소드 showSum에 액세스 1회 (객체 작성 전)

        Computer2 com1 = new Computer2();
        com1.setOsMemory("Windows 11", 64);
        com1.show();
        Computer2.showSum(); // 클래스 메소드 showSum에 액세스 2회 (com1객체 작성 후)

        Computer2 com2 = new Computer2();
        com2.setOsMemory("Windows 10", 8);
        com2.show();
        Computer2.showSum(); // 클래스 메소드 showSum에 액세스 3회 (com1, com2객체 작성 후)
    }
}
