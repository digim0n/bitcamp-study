package chap09;

public class ReturnValueArray {
    public static void main(String[] args) {

        String[] jeju = new String[2];

        jeju = makeArray("성상일출봉", "한라산","만장굴");

        for(int i = 0; i < jeju.length ; i++){
            System.out.println("jeju[" + i + "]값은, " + jeju[i]);
        }
    }

    static String[] makeArray(String name1,String name2,String name3){

        String[] localArray = {name1,name2,name3};
        return localArray;

    }
}
