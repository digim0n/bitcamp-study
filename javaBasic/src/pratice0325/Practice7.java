package pratice0325;

public class Practice7 {
    public static void main(String[] args) {
        System.out.println("로봇 총 생산수:" + Robot.getTotal());

        Robot[] robots = {
                new Robot("RX"),
                new Robot("PZ"),
                new Robot("SS"),
                new Robot("FG"),
                new Robot("VC"),
                null
        };

        System.out.println("로봇 총 생산 수:" + Robot.getTotal());
        robots[5] = new Robot("SUPER-Z");
        System.out.println("로봇 총 생산수:" + Robot.getTotal());
        System.out.println();

        for(int i=0; i<robots.length; i++){
            robots[i].introduce();
        }
    }
}

class Robot{
    private int id;
    private String name;
    private static int total;

    public Robot(String name){
        total++;
        this.name = name;
        this.id = total;
    }

    public static int getTotal(){
        return total;
    }
    public void introduce(){
        System.out.println("ID:" + this.id + "NAME:" + this.name);
    }
}