package practice0328;

public class Practice7 {
  public static void main(String[] args) {
    int level = 3;
    int space;
    int rows = level;

    for(int i=1, k=0; i<=rows; i++, k=0){
      for(space=1; space<=(rows-i); space++){
        System.out.print("□ ");
      }
      while(k!=(2*i-1)){
        System.out.print("■ ");
        k++;
      }
      System.out.println();
    }
  }
}



