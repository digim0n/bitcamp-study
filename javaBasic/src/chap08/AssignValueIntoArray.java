package chap08;

public class AssignValueIntoArray {
    public static void main(String[] args){
        //Declaration
        int[] jasonAPT = new int[3];

        //Initialization
        jasonAPT[0] = 3;
        jasonAPT[1] = 1;
        jasonAPT[2] = 10;

        System.out.println("0호실 거주년수 : " + jasonAPT[0]);
        System.out.println("1호실 거주년수 : " + jasonAPT[1]);
        System.out.println("2호실 거주년수 : " + jasonAPT[2]);
    }
}
