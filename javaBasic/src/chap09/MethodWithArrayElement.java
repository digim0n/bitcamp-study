package chap09;

public class MethodWithArrayElement {
    static void checkPass(int point){

        if(point >= 50){
            System.out.println(point + "점 합격!");
        }else{
            System.out.println(point + "점 불합격!");
        }
        System.out.println(" ======== ");

    }

    public static void main(String[] args) {

        // String형의 이름을 관리하는 배열의 선언과 초기화
        String[] aryName = {"A", "B", "C", "D"};

        // int형 점수를 관리하는 배열의 선언과 초기화
        int[] point = {85, 32, 60, 40};

        for(int i = 0; i < aryName.length; i++){
            System.out.print(aryName[i] + "님, ");
            checkPass(point[i]);
        }
    }
}
