package chap18;

public class AssignValueOfClassType2 {
    public static void main(String[] args) {
        // 클래스형 변수 com1선언하여 Computer1객체 생성
        System.out.println("com1을 선언했습니다.");
        Computer1 com1 = new Computer1();

        // OS와 메모리 정보 설정
        com1.setComputer("Windows 11", 32);

        // 클래스형 변수 com2 선언
        System.out.println("com2을 선언했습니다.");
        Computer1 com2;

        // com2에 com1을 대입
        System.out.println("com2에 com1를 할당했습니다.");
        com2 = com1;

        System.out.println("\n-[정보 변경전 PC 정보 표시]================");
        System.out.print("com1은 "); // com1의 정보표시
        com1.show();
        System.out.println();
        System.out.print("com2은 "); // com2의 정보표시
        com2.show();
        System.out.println("=====================================\n");

        // com1에서 변경
        System.out.println("com1의 PC를 변경했습니다.");
        com1.setComputer("Windows 10", 16);

        System.out.println("\n-[정보 변경 후 PC정보 표시]==============");
        com1.show();
        System.out.println();
        System.out.print("com2는 ");
        com2.show();
        System.out.println("=====================================\n");
    }
}
