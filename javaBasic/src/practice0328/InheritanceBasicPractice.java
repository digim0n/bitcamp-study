package practice0328;

public class InheritanceBasicPractice {
    public static void main(String[] args) {
        Pitcher  p = new Pitcher ("홍길동", 99, 0.09, 2.13);
        p.introduce();
    }
}

class BaseballPlayer {
    protected String name;
    protected int uniformNumber;
    protected double battingAverage;
}

class Pitcher  extends BaseballPlayer {
    private double era;

    public Pitcher (String name, int uniformNumber, double battingAverage, double era){
        this.name = name;
        this.uniformNumber = uniformNumber;
        this.battingAverage = battingAverage;
        this.era = era;
    }

    public void introduce(){
        System.out.println("선수명: " + this.name);
        System.out.println("등번호: " + this.uniformNumber);
        System.out.println("타율: " + this.battingAverage);
        System.out.println("방어율: " + this.era);
    }
}