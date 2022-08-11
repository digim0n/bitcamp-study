package pratice0325;

public class Practice5 {
    public static void main(String[] args) {
        Square square = new Square(4.5, 2.8);

        square.inform();
        System.out.println("이 사격형 면적은 " + square.getArea() + " 입니다.");

        square.addWidth(3.0);
        System.out.println();

        square.inform();
        System.out.println("이 사각형 면적은 " + square.getArea() + " 입니다.");
    }
}

class Square{
    private double width;
    private double height;

    public Square(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void inform(){
        System.out.println("이 사각형의 너비는 " + this.width + " 이고 높이는 " + this.height + " 입니다.");
    }

    public double getArea(){
        return (this.width * this.height);
    }

    public void addWidth(double add){
        this.width += add;
    }
}
