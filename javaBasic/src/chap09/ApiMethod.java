package chap09;

import java.util.Scanner;

public class ApiMethod {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.print("1번쨰 정수 입력: ");
        String strNum1 = sin.nextLine();
        int intNum1 = Integer.parseInt(strNum1);

        System.out.print("2번쨰 정수 입력: ");
        int intNum2 = sin.nextInt();

        if (intNum1 != intNum2) {
            int maxNum = Math.max(intNum1, intNum2);
            System.out.println(intNum1 + "와 " + intNum2 + "는 " + maxNum + "이 더 큽니다.");
        } else {
            System.out.println(intNum1 + "와 " + intNum2 + "는 동일합니다.");
        }

    }
}
