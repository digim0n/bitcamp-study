package practice0401;

import java.util.*;

public class ArrayListBasicPractice {
    public static void main(String[] args) {
        //영숫자 단어 저장용 변수 선언 및 ArrayList 객체 생성.
        ArrayList<String> number = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //영숫자 단어 저장.
        number.add("zero");
        number.add("one");
        number.add("two");
        number.add("three");
        number.add("four");
        number.add("five");
        number.add("six");
        number.add("seven");
        number.add("eight");
        number.add("nine");
        number.add("ten");
        //영어 단어 입력.
        System.out.println("0에서 10까지으 영문 단어를 입력하시오");
        String input = sc.nextLine();

        int index = number.indexOf(input);
        if(index!=-1){
            System.out.println(input+"는 숫자로 "+index);
        }else{
            System.out.println(input+"은 영어 단어로 존재하지 않습니다.");
        }
    }
}
