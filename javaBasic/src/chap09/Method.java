package chap09;

public class Method {
    static void checkPass(int point){

        if(point >= 50){
            System.out.println(point + "점으로 합격!");
        }else{
            System.out.println(point + "점으로 불합격!");
        }
        System.out.println(" ======= ");
    }

    public static void main(String[] args) {

        // 점수를 관리하는 변수 및 초기화
        int pointA = 85;
        int pointB = 32;
        int pointC = 60;
        int pointD = 40;

        System.out.print("A님, ");
        checkPass(pointA);

        System.out.print("B님, ");
        checkPass(pointB);

        System.out.print("C님, ");
        checkPass(pointC);

        System.out.print("D님, ");
        checkPass(pointD);
    }
}
