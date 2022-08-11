package practice0328;

public class InheritanceConstructorPractice {
    public static void main(String[] args) {
        Magazine magazine = new Magazine("GQ", 10000, "정우성");
        magazine.show();
    }
}

class Book {
    private String title;
    private int price;

    public Book(String title, int price){
        this.title = title;
        this.price = price;
    }

    public String getTitle(){
        return title;
    }

    public int getPrice(){
        return price;
    }
}

class Magazine extends Book {
    private String coverPersonName;

    public Magazine(String title, int price, String coverPersonName){
        super(title, price);
        this.coverPersonName = coverPersonName;
    }

    public void show(){
        System.out.println(getTitle() + " 절찬 판매중!");
        System.out.println("정가 " + getPrice() + "원");
        System.out.println("이번 표지: " + this.coverPersonName);
    }
}