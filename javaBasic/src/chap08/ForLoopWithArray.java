package chap08;

public class ForLoopWithArray {
    public static void main(String[] args){
        int[] intArray = new int[3];

        for(int i=0; i<intArray.length; i++){
            intArray[i] = 100 + i;
            System.out.println("intArray[" + i + "]값: " + intArray[i]);
        }
    }
}
