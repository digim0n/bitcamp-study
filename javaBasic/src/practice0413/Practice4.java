package practice0413;

public class Practice4 {
    public static void main(String[] args) {
        int[][] x = {
                {1,2,3},
                {4,5,6}};
        int[][] y = {
                {6,3,4},
                {5,1,2}};
        int[][] z = new int[x.length][x[0].length];

        boolean result = addMatrix(x, y, z);
        printMatrix(x,y,z);
    }

    static boolean addMatrix(int[][] x, int[][] y, int[][] z){
        if((x.length==y.length)&&(x[0].length==y[0].length)){
            for(int i=0; i<x.length;i++){
                for(int j=0; j<x[0].length;j++){
                    z[i][j] = x[i][j] + y[i][j];
                }
            }
            return true;
        }else{
            return false;
        }
    }

    static void printMatrix(int[][] x, int[][] y, int [][] z){
        for(int i=0; i<x.length;i++){
            for(int j=0; j<x[0].length;j++){
                System.out.print(z[i][j]+" ");
            }
            System.out.println();
        }
    }
}
