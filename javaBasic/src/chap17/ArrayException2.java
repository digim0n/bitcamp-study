package chap17;

public class ArrayException2 {
    public static void main(String[] args) {
        try{
            int[] intArray = new int[5];

            System.out.println("intArray[10]에 숫자를 할당합니다.");
            intArray[10] = 50;

            System.out.println("intArray[10]에 50을 할당하였습니다.");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 요소수를 초과했습니다.");
        }
        System.out.println("프로그램 종료");
    }
}
