package practice03;

public class Exercise30 {
  public static void main(String[] args){
    //Declaration
    int[] arr = {3, 7, 0, 8, 4, 1, 9, 6, 5, 2};
    int currElement = 0;

    //Print
    for(int i=0; i<arr.length; i++){
      System.out.println("현재 요소 " + currElement + " 의 배열 값은 " + arr[currElement]);
      currElement = arr[currElement];
    }
  }
}



//현재요소 + 0의배열값은 +3
//현재요소 3의 배열값은 8
//현재요소 8의 배열값은 5
//현재요소 5의 1


//현재 요소의 배열값을 출력하고 다음요소의 배열값을 출력할때 사용한다.
