package chap09;

import java.util.Scanner;

public class Practice903 {
    static void dispLine(int num){
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                outSign();
            }
            System.out.println();
        }
    }

    static void outSign(){
        System.out.print("* ");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input;

        System.out.print("정수를 입력하시오: ");
        input = sc.nextInt();

        dispLine(input);
    }
}
