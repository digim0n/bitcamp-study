package chap08;

public class Practice0802 {
    public static void main(String[] args){
        int[] score = {32, 75, 85, 46, 50};

        for(int i = (score.length - 1); i >= 0; i--){
            System.out.println("score[" + i + "] = " + score[i]);
        }
    }
}
