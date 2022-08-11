package chap11;

class Person02 {
    String name;
    int age;

    public void showPerson(){
        System.out.println("이 사람의 이름은 " + this.name + "이고, 나이는 " + this.age + "살입니다.");
    }
}

public class Practice1101 {
    public static void main(String[] args){
        //Construct
        Person02 person1 = new Person02();
        Person02 person2 = new Person02();

        //person1
        person1.name = "유성민";
        person1.age = 28;

        //person2
        person2.name = "이동훈";
        person2.age = 29;

        //Print person1 and person2
        person1.showPerson();
        person2.showPerson();

    }
}
