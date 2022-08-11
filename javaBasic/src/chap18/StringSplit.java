package chap18;

public class StringSplit {
    public static void main(String[] args) {
        // 변수선언
        String str1 = "12345";
        String str2 = "AB:CD:EF";

        // substring메소드를 사용하여 임의의 위치에서 분할
        System.out.println(str1 + "의 처음부터 3번째 문자는 " + str1.substring(0, 3) + "입니다.");
        System.out.println(str1 + "의 세번째문자부터 마지막 문자는 " + str1.substring(2) + "입니다.\n");

        // split메소드를 이용하여 지정문자 ":"로 분할
        String[] strArray = str2.split(":");

        // 분할된 몇분동안 루프 처리
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(":으로 나누어진 " + (i + 1) + " 2번째 문자는 " + strArray[i] + "입니다.");
        }
    }
}
