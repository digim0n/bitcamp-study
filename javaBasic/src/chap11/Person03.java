package chap11;

public class Person03 {
    String name;
    int age;

    public void showPerson(){
        System.out.println("이 사람의 이름은 " + this.name + "이고, 나이는 " + this.age + "살입니다.");
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
