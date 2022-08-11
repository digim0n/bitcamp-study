package chap09;

public class NoMethod {
    public static void main(String[] args) {
        // 점수를 관리하는 변수 선언 및 초기화
        int pointA = 85;
        int pointB = 32;
        int pointC = 60;
        int pointD = 40;

        System.out.print("A남");
        if (pointA >= 50) {
            System.out.println(pointA + "점으로 합격!");
        } else {
            System.out.println(pointA + "점으로 불합격!");
        }
        System.out.println(" ======= ");

        System.out.print("B님");
        if (pointB >= 50) {
            System.out.println(pointB + "점으로 합격!");
        } else {
            System.out.println(pointB + "점으로 불합격!");
        }
        System.out.println(" ======= ");

        System.out.print("C님");
        if (pointC >= 50) {
            System.out.println(pointC + "점으로 합격!");
        } else {
            System.out.println(pointC + "점으로 불합격!");
        }
        System.out.println(" ======= ");

        System.out.print("D님");
        if (pointD >= 50) {
            System.out.println(pointD + "점으로 합격!");
        } else {
            System.out.println(pointD + "님으로 불합격!");
        }
        System.out.println(" ======= ");

    }
}
