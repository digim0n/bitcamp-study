package chap05;

import java.util.Scanner;

public class MultipleInputFromKeyboard {
    public static void main(String[] args) {
        int[] twoInput = new int[2];

        Scanner sc = new Scanner(System.in);

        //이거는 인풋 갯수가 정해져 있을때만 가능,
        //인풋 갯수가 랜덤이면 아마도 "리스트" 활용해야할것임.
        for(int j=0; j<2; j++) {
            if (sc.hasNext() == true) {
                twoInput[j] = sc.nextInt();
            }
        }

        //Add
        System.out.println(twoInput[0] + twoInput[1]);
    }
}

