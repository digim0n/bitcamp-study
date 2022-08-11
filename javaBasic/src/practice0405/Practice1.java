package practice0405;

public class Practice1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Bird();

        for(int i=0; i<animals.length; i++){
            animals[i].sing();
        }
    }
}

abstract class Animal {
    public abstract void sing();
}

class Dog extends Animal {
    public void sing(){
        System.out.println("멍 멍");
    }
}

class Cat extends Animal {
    public void sing(){
        System.out.println("야옹 야옹");
    }
}

class Bird extends Animal {
    public void sing(){
        System.out.println("뻐꾹 뻐꾹");
    }
}