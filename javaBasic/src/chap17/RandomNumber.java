package chap17;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int random = rand.nextInt(999);

        System.out.println(random);
    }
}
