package practice0412;

public class Practice {
    public static void main(String[] args) {
        CollectionBox cb = CollectionBox.getInstance();

        MultiMillionaire mm1 = new MultiMillionaire(cb);
        MultiMillionaire mm2 = new MultiMillionaire(cb);
        MultiMillionaire mm3 = new MultiMillionaire(cb);
        MultiMillionaire mm4 = new MultiMillionaire(cb);
        MultiMillionaire mm5 = new MultiMillionaire(cb);

        mm1.start();
        mm2.start();
        mm3.start();
        mm4.start();
        mm5.start();

        try{
            mm1.join();
            mm2.join();
            mm3.join();
            mm4.join();
            mm5.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("모금 총액: " + cb.getTotalAmount() + "원");
    }
}
