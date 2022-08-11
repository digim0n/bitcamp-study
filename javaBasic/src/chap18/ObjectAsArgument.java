package chap18;

public class ObjectAsArgument {
    public static void checkMemory(Computer2 com) {
        int reasonableMemory; //알맞은 메모리값 저장변수
        String os = com.getOs(); // 인수의 클래스형 변수로부터 OS명을 얻음
        int memory = com.getMemory(); //인수의 클래스형 변수로부터 메모리 크기 얻음
        com.show(); //PC정보 표시

        //OS명으로부터 알맞은 메모리 크기 판정
        if (os.equals("Windows11")) {
            //OS Windows 11인 경우
            reasonableMemory = 32;
        } else if (os.equals("Windows 10")) {
            //OS Windows 10인 경우
            reasonableMemory = 16;
        } else {
            // 기타
            reasonableMemory = 8;
        }

        // 알맞은 메모리 크기 확인
        if (memory >= reasonableMemory) {
            System.out.println("메모리 크기는 알맞습니다.");
        } else {
            System.out.println("메모리를 추가하는 것이 좋습니다.");
        }
        System.out.println("======================================");
    }

    public static void main(String[] args) {
        //Computer2클래스 객체화
        Computer2 com1 = new Computer2();
        Computer2 com2 = new Computer2();

        //PC정보 설정
        com1.setOs("Windows11");
        com1.setMemory(32);
        com2.setOs("Windows11");
        com2.setMemory(16);

        // 인수에 클래스형 변수(객체)를 넘기는 메소드 호출
        System.out.println("======================================");
        checkMemory(com1);
        checkMemory(com2);
    }
}
