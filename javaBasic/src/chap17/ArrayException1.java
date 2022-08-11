package chap17;

public class ArrayException1 {
    public static void main(String[] args) {
        int[] intArray = new int[5];

        // 10인덱스에 값을 대입
        System.out.println("intArray[10]에 숫자를 할당합니다.");
        intArray[10] = 50; // 최대 배열요소수를 초과하는 대입처리

        // 결과 표시
        System.out.println("intArray[10]에 50을 할당했습니다.");
        System.out.println("처리 종료 ");

    }
}
