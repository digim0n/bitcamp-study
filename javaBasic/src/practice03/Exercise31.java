package practice03;

public class Exercise31 {
  public static void main(String[] args){
    //Declaration
    int[] arr = {3, 7, 0, 8, 4, 1, 9, 6, 5, 2};

    for(int i=0; i<arr.length-1; i++){
      System.out.println("Result = " + (arr[i] - arr[i+1]));
    }
  }
}


//Result= 3-7= -4
//Re= 7-0=7
//0-8 =-8
//8-4 =4

