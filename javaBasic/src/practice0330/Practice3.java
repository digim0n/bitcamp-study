package practice0330;

import java.util.Scanner;
import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        int median;

        System.out.print("정수 a: ");
        a = sc.nextInt();
        System.out.print("정수 b: ");
        b = sc.nextInt();
        System.out.print("정수 c: ");
        c = sc.nextInt();

        median = med(a,b,c);
        System.out.println("중간값은 " + median + "입니다.");
    }

    public static int med(int a, int b, int c){
        int[] arr = {a,b,c};

        Arrays.sort(arr);
        return arr[1];
    }
}
