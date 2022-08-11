package chap11;

public class Computer5 {
    String os;
    int memory;

    // 메시지와 PC 정보를 표시하는 메소드
    public void showComputer() {
        System.out.println("PC정보를 표시합니다.");
        // 클래스의 show메소드 호출
        show();
    }

    // 필드 변수의 값을 표시하는 메소드
    public void show() {
        System.out.println("OS는 " + os + "입니다.");
        System.out.println("메모리 크기는 " + memory + "GB입니다.");
    }

    // 필드변수에서 OS값을 얻음
    public String getOs() {
        return os;
    }

    // 필드변수에 Memory 값을 설정하는 메소드
    public int getMemory() {
        return memory;
    }

    // 필드 변수에 값을 설정하는 메소드
    public void setOsMemory(String name, int size) {
        os = name;
        memory = size;
        System.out.println("OS는 " + name + "이고, 메모리코드를 " + size
                + "GB로 변경되었습니다.");
    }
}