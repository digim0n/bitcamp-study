package chap05;

import java.util.Scanner;

public class KeyboardInputStringValue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력: ");
        String name = sc.nextLine();
        System.out.println("내 이름은 " + name + "입니다.");
    }
}