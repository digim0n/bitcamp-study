package practice0330;

import java.util.Scanner;
import java.util.Random;

public class Practice4 {
    public static void main(String[] args) {
        int low, high;
        Scanner sc = new Scanner(System.in);
        int rand;

        System.out.println("난수를 생성합니다");
        System.out.print("하한값: ");
        low = sc.nextInt();
        System.out.print("상한값: ");
        high = sc.nextInt();

        rand = random(low, high);

        System.out.println("생성한 난수는 " + rand + "입니다.");

    }

    public static int random(int a, int b){
        Random rand = new Random();
        int randInt = rand.nextInt(b-a) + a;

        return randInt;
    }
}
