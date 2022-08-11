package chap05;

public class IncrementOperator {
    public static void main(String[] args) {

        // 증가에 대한 값을 관리하는 변수 초기화
        int num = 9;

        System.out.println(" ===== 전치 증가 ===== ");
        System.out.println(num);    // 초기값 출력
        System.out.println(++num);  // 합쳐진 후 출력
        System.out.println(num);    // 전치증가 후 값 표시

        // 증가에 대한 값을 관리하는 변수 다시 초기화
        num = 9;

        System.out.println(" ====== 후치 증가 ===== ");
        System.out.println(num);    // 초기값 출력
        System.out.println(num++);  // 출력 후 더함
        System.out.println(num);    // 후치 증가후 값 출력
    }
}
