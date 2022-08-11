package chap11;

public class InstanceMethod2 {
    public static void main(String[] args) {
        // Computer5클래스에 객체 생성
        Computer5 com = new Computer5();

        // 객체의 필드 변수에 각 데이터를 저장함
        com.os = "Windows 11";
        com.memory = 32;

        // 메소드를 사용하여 필드 변수에 저장된 데이터를 가져옴
        System.out.println("PC OS는 " + com.getOs() + "입니다.");
        System.out.println("메모리 크기는 " + com.getMemory() + "GB입니다.");

        // 객체 필드변수에 각 데이터를 다시 저장함
        com.setOsMemory("Windows 10", 16);

        // showComputer 메소드 호출
        com.showComputer();
    }
}