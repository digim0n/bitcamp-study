package chap08;

public class TwoDimensionArrayWithKukuDan {
    public static void main(String[] args){
        int[][] kukuDan = new int[9][9];

        for(int initial = 0; initial < 9; initial++){
            for(int j = 0; j < 9; j++){
                kukuDan[initial][j] = (initial + 1) * (j + 1);
            }
        }

        for(int initial = 0; initial < 9; initial++){
            System.out.println("------------------------");
            System.out.println((initial + 1) + "단");
            for(int j = 0; j < 9; j++){
                System.out.print(kukuDan[initial][j] + " ");
            }
            System.out.println();
            System.out.println("------------------------");
        }
    }
}
