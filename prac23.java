import java.util.LinkedList ;
class SharedBuffer{
    private LinkedList<Integer>buffer = new LinkedList<>();
    private final int LIMIT =5;
    public synchronized void produce () throws InterruptedException{
        int value =500;
        while(true){
            while (buffer.size()==LIMIT){
                wait();
            }
            System.out.println("producer produced :"+ value);
            buffer.add(value++);
            notify();
            Thread.sleep(1000);
        }

    }
    public synchronized void consumer () throws InterruptedException{
        while(true){
        while(buffer.isEmpty()){
               wait();
        }
        int value = buffer.removeFirst();
        System.out.println("consumer consumed"+value);
        notify();
        Thread.sleep(1500);
    }
}
}
public class prac23{
    public static void main(String[] args) throws InterruptedException {
        SharedBuffer buffer =new SharedBuffer();
        Thread produceThread = new Thread(()->{
            try{
                buffer.produce();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        });
        Thread consumerThread = new Thread(()->{
            try{
                buffer.consumer();

            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        });
        produceThread.join();
        consumerThread.join();
}
}


