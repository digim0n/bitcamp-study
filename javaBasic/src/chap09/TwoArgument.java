package chap09;

public class TwoArgument {
    static void checkPass(int point, int passPoint) {

        if (point >= passPoint) {
            System.out.println(point + "점 합격!");
        } else {
            System.out.println(point + "점 불합격!");
        }
        System.out.println(" ======= ");

    }

    public static void main(String[] args) {

        int pointA = 85;
        int pointB = 32;
        int pointC = 60;
        int pointD = 40;

        System.out.print("A님, ");
        checkPass(pointA, 50);

        System.out.print("B님, ");
        checkPass(pointB, 50);

        System.out.print("C님, ");
        checkPass(pointC, 50);

        System.out.print("D님, ");
        checkPass(pointD, 50);
    }
}
