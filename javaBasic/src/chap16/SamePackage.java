package chap16;

public class SamePackage {
    public static void main(String[] args) {
        Computer2 com = new Computer2(); // Computer2클래스를 객체화
        com.setOsMemory("Windows 11", 128); // OS및 메모리값 설정
        com.show(); //컴퓨터 정보 확인
    }
}