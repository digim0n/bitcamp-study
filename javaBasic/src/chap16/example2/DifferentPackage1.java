package chap16.example2;

import chap16.example1.Computer3;

public class DifferentPackage1 {
    public static void main(String[] args) {
        // 다른 패키지의  Computer3클래스를 완전 한정자명으로 지정하여 객체화
        Computer3 com = new Computer3();
        com.setOsMemory("Windows 11", 32);
        com.show();
    }
}
