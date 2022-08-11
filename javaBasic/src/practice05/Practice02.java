package practice05;

public class Practice02 {
    public static void main(String[] args){
        int price;
        price = priceCalc(20);
        System.out.println("Price = " + price);
    }

    public static int priceCalc(int numPeople){
        int price = 0;

        if(numPeople < 5){
            price = 6000 * numPeople;
        }else if((numPeople>=5) && (numPeople<20)) {
            price = 5500 * numPeople;
        }else if(numPeople >= 20){
            price = 5000 * numPeople;
        }
        return price;       //return 0 if numPeople is not valid!
    }
}
