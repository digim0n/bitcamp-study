package practice0412;

public class MultiMillionaire extends Thread{
    private CollectionBox cb;

    public MultiMillionaire(final CollectionBox cb){
        this.cb = cb;
    }

    @Override
    public void run(){
        //1원씩 100만원
        for(int i=0; i<1000000; i++){
            cb.contribute(1);
        }
    }
}
