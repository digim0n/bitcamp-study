package chap18;

public class AssignValueOfClassType1 {
    public static void main(String[] args) {
        // 클래스형 변수 com1을 선언하여 Computer1객체를 생성함
        System.out.println("com1을 선언합니다.");
        Computer1 com1 = new Computer1();

        // OS와 메모리 정보 설정
        com1.setComputer("Window 11", 32);

        // 클래스형 변수 com2선언
        System.out.println("com2를 선언했습니다.");
        Computer1 com2;

        // com2에 com1대입
        System.out.println("com2에 com1을 할당했습니다.");
        com2 = com1;

        System.out.println("\n=[정보변경 전 PC정보 표시]================");
        System.out.print("com1은 "); // com1정보 표시
        com1.show();
        System.out.println();
        System.out.print("com2은 "); // com2 정보 표시
        com2.show();

        System.out.println("=====================================\n");
    }
}
