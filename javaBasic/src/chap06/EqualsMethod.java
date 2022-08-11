package chap06;

public class EqualsMethod {

    public static void main(String[] args) {
        //비교용 문자열을 관리하는 변수 선언 및 초기화
        String str = "테스트";

        System.out.println(" ===== if문 시작 ===== ");

        if (str.equals("테스트")) {
            System.out.println("String형 변수 str과 문자열 \"테스트\"는 의미적으로 동일함");
        }

        System.out.println(" ===== if문 종료 ===== ");
        
    }

}