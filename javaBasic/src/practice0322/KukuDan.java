package practice0322;

class OneDan {
    public void printKuku(int dan){
        System.out.print(dan + "단을 출력합니다.");
        for (int i = 1; i <= 9; i++) {
            System.out.print((i*dan) + " ");
        }
        System.out.println();
    }
}

public class KukuDan {
    public static void main(String[] args){
        OneDan dan = new OneDan();

        //1단부터 9단까지 출력
        dan.printKuku(1);
        dan.printKuku(2);
        dan.printKuku(3);
        dan.printKuku(4);
        dan.printKuku(5);
        dan.printKuku(6);
        dan.printKuku(7);
        dan.printKuku(8);
        dan.printKuku(9);


    }
}
