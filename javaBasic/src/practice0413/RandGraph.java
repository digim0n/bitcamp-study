package practice0413;

import java.util.Random;
import java.util.Scanner;

public class RandGraph {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int upperBound = 10;
        int index = 0;

        System.out.print("요소수: ");
        index = sc.nextInt();

        int[] arr = new int[index];

        //Filling array[index] with random numbers
        for(int i=0; i<index; i++){
            arr[i] = rand.nextInt(upperBound);
            System.out.print(arr[i]+ " ");
        }

        //Printing Graph Top-Down
        for(int i=10; i>0; i--){
            for(int j=0; j<index; j++){
                if(arr[j] >= i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //Printing Index Numbers
        for(int i=0; i<index; i++){
            System.out.print((i%10) +" ");
        }
    }
}
