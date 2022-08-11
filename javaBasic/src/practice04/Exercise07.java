package practice04;

public class Exercise07 {
    static void printStars(int numStars){
        for(int i=1; i<=numStars; i++){
            for(int j=0; j<i; j++){
                System.out.print("$");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        printStars(3);
        printStars(4);
        printStars(5);
    }
}
