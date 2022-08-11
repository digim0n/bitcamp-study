package chap09;

public class ChangeArrayElement4 {
    static void changeJeju(String[] aryData){
        aryData[0] = "위몽";
        aryData[1] = "위몽위몽";
        aryData[2] = "위몽위몽위몽";
    }

    public static void main(String[] args) {

        String[] jeju = { "성산일출봉", "한라산","만장굴" };

        System.out.println(" === 제주 3대 관광지 === ");

        for(int i = 0; i < jeju.length ; i++){
            System.out.println("jeju[" + i + "]값은、" + jeju[i]);
        }

        changeJeju(jeju);

        System.out.println(" === 제주 3대 관광지 === ");

        for(int i = 0; i < jeju.length ; i++){
            System.out.println("jeju[" + i + "]값은," + jeju[i]);
        }
    }
}
