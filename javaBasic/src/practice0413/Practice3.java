package practice0413;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double average = 0;

        System.out.print("요소수: ");
        int index = sc.nextInt();
        double[] arr = new double[index];


        for(int i=0; i<index; i++){
            System.out.print("arr["+i+"]: ");
            arr[i] = sc.nextDouble();
            total += arr[i];
        }
        System.out.println("모든 요소의 합: "+total);
        System.out.println("모든 요소의 평균: "+total/(index));
    }
}
