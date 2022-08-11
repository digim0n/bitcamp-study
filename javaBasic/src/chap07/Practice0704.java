package chap07;

public class Practice0704 {
    public static void main(String[] args){
        for(int i=0; i<41; i++){
            if((i%2)==1){
                continue;
            }
            if(i>20){
                break;
            }
            System.out.println(i);
        }
    }
}
