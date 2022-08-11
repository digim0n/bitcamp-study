package practice0330;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index, idx, x;

        System.out.print("요소수: ");
        index = sc.nextInt();
        int[] arr = new int[index];

        for(int i=0; i<index; i++){
            System.out.print("x[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("삽입할 인덱스: ");
        idx = sc.nextInt();
        System.out.print("삽입할 값: ");
        x = sc.nextInt();

        arr = arrayInsOf(arr, idx, x);

        for(int i=0; i<index+1; i++){
            System.out.println("y["+ i + "]: " + arr[i]);
        }
    }

    public static int[] arrayInsOf(int[] a, int idx, int x){
        int[] newArr = new int[a.length+1];
        int count=0;

        for(int i=0; i<(a.length+1); i++){
            if(i == idx){
                newArr[i] = x;
                break;
            }else{
                newArr[i] = a[i];
                count++;
            }
        }
        for(int i=count+1; i<newArr.length; i++){
            newArr[i] = a[i-1];
        }

        return newArr;
    }
}
