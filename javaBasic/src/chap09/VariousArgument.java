package chap09;

public class VariousArgument {
    static void checkPass(String name, int point, int passPoint) {

        System.out.print(name + "님, ");

        if (point >= passPoint) {
            System.out.println(point + "점 합격!");
        } else {
            System.out.println(point + "점 불합격!");
        }
        System.out.println(" ======== ");
    }

    public static void main(String[] args) {

        int pointA = 85;
        int pointB = 32;
        int pointC = 60;
        int pointD = 40;

        checkPass("A", pointA, 50);
        checkPass("B", pointB, 50);
        checkPass("C", pointC, 50);
        checkPass("D", pointD, 50);

    }
}
