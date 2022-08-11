package chap11;

class Computer1 {
    String os;
    int memory;
}

public class MakeObject {
    public static void main(String[] args){
        Computer1 com = new Computer1();

        System.out.println("com = " + com);

        com.os = "Hello World!";
        System.out.println(com.os);

        com.memory = 30;
        System.out.println(com.memory * com.memory);

    }
}
