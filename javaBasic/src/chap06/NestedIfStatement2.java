package chap06;

public class NestedIfStatement2 {
    public static void main(String[] args){
        // 비교를 위한 숫자를 관리하는 변수
        int a = 33;

        System.out.println(" ===== if문 판정 확인 ===== ");

        if(a >= 0){
            System.out.println("변수a는 0이상이다");
            if(a <= 10){
                System.out.println("변수a는 10이하이다");
            }else{
                System.out.println("변수a는 10보다 크다。");
            }
        }
        System.out.println(" ===== if문 판정 확인 ===== ");;
    }
}
