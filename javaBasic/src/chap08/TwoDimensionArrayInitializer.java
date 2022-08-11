package chap08;

public class TwoDimensionArrayInitializer {
    public static void main(String[] args){
        // int형 2차원배열의 선언과 요소의 초기화
        int[][] intArray = {
                {50,150,250},
                {300,200,100}
        };

        for(int i = 0; i < intArray.length; i++){
            for(int j = 0; j < intArray[i].length; j++){
                System.out.println("intArray["+i+"]["+j+"]값 : " + intArray[i][j]);
            }
            System.out.println();
        }
    }
}
