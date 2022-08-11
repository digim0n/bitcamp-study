package practice0412;

public class CollectionBox {
    private int totalAmount;

    private CollectionBox(){
        this.totalAmount = totalAmount;
    }

    public static CollectionBox getInstance(){
        return new CollectionBox();
    }

    public synchronized void contribute(int donate){
        this.totalAmount += donate;
    }

    public int getTotalAmount(){
        return this.totalAmount;
    }
}
