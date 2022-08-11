package chap09;

public class ArrayArgument {
    static void display(String[] aryData) {
        for (int i = 0; i < aryData.length; i++) {
            System.out.println(aryData [i]);
        }
    }

    public static void main(String[] args) {
        String[] jeju = { "성산일출봉", "한라산","만장굴" };

        System.out.println(" === 제주 3대 관광지 === ");
        display(jeju);
    }
}
