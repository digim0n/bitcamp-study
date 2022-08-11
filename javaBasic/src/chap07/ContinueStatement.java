package chap07;

public class ContinueStatement {

    public static void main(String[] args) {

        System.out.println(" ===== 반복 시작 ===== ");
        while(true){
            // 1에서 9까지의 임의의 숫자를 얻음
            int num = (int)(Math.random()*9)+1;

            if(num==4){
                //4의 경우 다시 반복 처음으로 돌아감
                System.out.println(num+"이 나오면 반복시작점으로 간다!");
                continue;
            }

            // 무작위 숫자 표시
            System.out.println("랜덤숫자 = "+num);

            if(num%2==0){
                // 짝수가 나오면 무한루프에서 나가기
                System.out.println("4 이외의 짝수숫자가 나오면 반복에서 나갑니다!");
                break;
            }
        }
        System.out.println(" ===== 반복 종료 ===== ");
    }
}
