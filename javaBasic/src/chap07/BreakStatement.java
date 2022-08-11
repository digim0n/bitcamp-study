package chap07;

import java.util.Scanner;

public class BreakStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = 0;

        while(true){
            System.out.println("반복을 시작하려면 'y'를 눌러주세요.");
            String result = sc.nextLine();

            if(result.equals("y")){
                count++;
                System.out.println(count + "번째 반복됨");
            }else{
                System.out.println("y키 외의 " + result + "가 입력 되었음으로 종료합니다.");
                break;
            }
        }
        System.out.println("반복종료");
    }
}
