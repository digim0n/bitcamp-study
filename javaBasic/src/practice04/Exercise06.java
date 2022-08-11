package practice04;

public class Exercise06 {
    static int intLarger(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args){
        int a = 8;
        int b = 4;
        int result;
        result = intLarger(a, b);
        System.out.println(result);
    }
}
