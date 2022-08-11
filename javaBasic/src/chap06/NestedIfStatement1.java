package chap06;

public class NestedIfStatement1 {
    public static void main(String[] args){
        //비교를 위한 숫자를 관리하기위한 변수 a를 선언하고 7로 초기화.
        int a = 7;

        System.out.println(" ===== if문 판정 확인 ===== ");

        if(a >= 0){
            System.out.println("변수a는 0이상입니다.");
            if(a <= 10){
                System.out.println("변수a는 10이하입니다.");
            }else{
                System.out.println("변수a는 10보다 크다.");
            }
        }
        System.out.println(" ===== if문 판정 확인 ===== ");
    }
}
