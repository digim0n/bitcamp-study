package chap18;

public class ObjectAsReturnValue {
    public static Computer3 makeComputer(String os) {
        // 알맞은 메모리값저장변수
        int reasonableMemory;

        // OS명에서 알맞은 메모리 크기 결정
        if (os.equals("Windows11")) {
            // OS- Windows 11
            reasonableMemory = 32;
        } else if (os.equals("Windows10")) {
            // OS-  Windows 10
            reasonableMemory = 16;
        } else {
            // 기타
            reasonableMemory = 8;
        }

        // 인수가 있는 생성자로 객체를 생성
        Computer3 com = new Computer3(os, reasonableMemory);

        // 리턴값으로 com설정
        return com;
    }

    public static void main(String[] args) {
        // 메소드의 인수로 설정할 변수를 선언
        String os1 = "Windows11";
        String os2 = "Windows10";

        // OS명을 인수로 설정하여 메소드를 호출함
        Computer3 com1 = makeComputer(os1);
        Computer3 com2 = makeComputer(os2);

        // 각 메소드의 리턴값에서 객체정보 표시
        System.out.print("제작한 첫번쨰");
        com1.show();
        System.out.println("=========================================");
        System.out.print("제작한 두번쨰");
        com2.show();
    }
}
