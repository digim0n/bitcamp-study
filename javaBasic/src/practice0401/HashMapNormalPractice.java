package practice0401;

import java.util.*;
import java.lang.*;

public class HashMapNormalPractice {
    public static void main(String[] args) {
        // 금고 인스턴스 만들기
        StrongBox guard = new StrongBox();
        // 비밀 단어 변수 선언
        String secret = null;
        try{
            // 첫 번째 보물 저장
            secret = "sgf01";
            guard.store(secret, new Treasure("다이어링"));
            // 두 번째 보물을 저장
            secret = "zkq02" ;
            guard.store(secret, new Treasure( "진주 목걸이" ));
            // 세 번째 보물을 저장
            secret = "xrt03" ;
            guard.store(secret, new Treasure( "금 팔찌" ));
            // 네 번째 보물을 저장 (비밀 단어 중복)
            secret = "xrt03" ;
            guard.store (secret, new Treasure ( "백금 귀걸이" ));
        }catch(DuplicateSecretException e){
            System.out.println( "비밀 단어 \"" + secret + "\"는 이미 붙어 있습니다" );
        }
        System.out.println();
        try{
            // 첫 번째 보물 획득
            secret = "sgf01" ;
            Treasure treasure1 = guard.getTreasure(secret);
            System.out.println(treasure1 + "을 받았습니다!" );
            // 두 번째 보물 획득
            secret = "zkq02" ;
            Treasure treasure2 = guard.getTreasure(secret);
            System.out.println(treasure2 + "을 받았습니다!" );
            // 세 번째 보물을 얻는다 (비밀의 말이 부정)
            secret = "xrr03" ;
            Treasure treasure3 = guard.getTreasure(secret);
            System.out.println(treasure3 + "을 받았습니다!" );
        }catch(IllegalSecretException e){
            System.out.println( "비밀 단어 \"" + secret + "\"는 악성" );
        }
    }
}

class Treasure {
    String type;

    public Treasure(String type){
        this.type = type;
    }

    @Override
    public String toString(){
        return this.type;
    }
}

class StrongBox {
    HashMap<String, Object> treasure = new HashMap<>();

    public StrongBox(){
    }

    public void store(String key, Object Treasure) throws DuplicateSecretException{
        if(this.treasure.containsKey(key)){
            throw new DuplicateSecretException();
        }else{
            System.out.println(Treasure.toString() + "를 금고에 저장했습니다!");
            this.treasure.put(key, Treasure);
        }
    }

    public Treasure getTreasure(String key) throws IllegalSecretException{
        if(!this.treasure.containsKey(key)){
            throw new IllegalSecretException();
        }else{
            Treasure trs = new Treasure(this.treasure.get(key).toString());
            return trs;
        }
    }
}

class DuplicateSecretException extends Exception{
    public DuplicateSecretException(){}
    public DuplicateSecretException(String error){
        super(error);
    }
}
class IllegalSecretException extends Exception {
    public IllegalSecretException(){}
    public IllegalSecretException(String error){
        super(error);
    }
}
