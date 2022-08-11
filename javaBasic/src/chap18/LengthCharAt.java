package chap18;

public class LengthCharAt {
    public static void main(String[] args) {
        String str = "Java 프로그래밍！"; // 문자열 설정
        char ch1 = str.charAt(0); // 첫번째 문자 얻기
        char ch7 = str.charAt(6); // 7번째 문자 얻기
        int len = str.length(); // 문자열 길이 가져옴

        // 결과 표시
        System.out.println(str + "의 첫번째 문자는 " + ch1 + "입니다.");
        System.out.println(str + "7번째 문자는 " + ch7 + "입니다.");
        System.out.println(str + "문자열 길이는 " + len + "입니다.");
    }
}
