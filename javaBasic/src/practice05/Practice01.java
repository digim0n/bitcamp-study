package practice05;

public class Practice01 {
    public static void main(String[] args){
        double meter = 3000;
        double price;

        price = taxiMeter(meter);
        System.out.println("Price = " + (int)price);
    }

    public static double taxiMeter(double meter){
        double price;

        if(meter <= 1700.0){
            return 6100.0;
        }else{
            meter -= 1700.0;
            price = (meter / 313.0) * 800.0;
            return (6100.0 + price);
        }
    }
}
