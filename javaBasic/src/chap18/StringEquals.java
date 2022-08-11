package chap18;

public class StringEquals {
    public static void main(String[] args) {
        // 변수선언
        String str1 = "안녕하세요.";
        String str2 = "방가방가";
        String str3 = "안녕!";
        String str4 = "방가방가";

        // 변수와 지정된 문자열로 비교
        if (str1.equals("안녕하세요.")) {
            System.out.println("str1(" + str1 + ")의 문자열은 안녕하세요와 동일합니다");
        }
        // 변수와 변수로 비교하기
        if (str2.equals(str4)) {
            System.out.println("str2(" + str2 + ") 및 str4(" + str4 + ")의 문자열은 동일합니다.");
        }
        // 문자열이 지정된 문자열과 다른 경우의 판정 방법
        if (!str2.equals(str3)) {
            System.out.println("str2(" + str2 + ") 및 str3(" + str3 + ")의 문자열은 동일하지 않합니다.");
        }
    }
}
