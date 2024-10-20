import java.util.Random;
import java.util.random.*;
public class prac24{
        public static void main(String[] args){
            Thread t1= new Thread(()->{
                Random rand =new Random();
                while(true){
                    int num =rand.nextInt(100);
                    System.out.println("generated :"+num);
                    if(num%2==0){
                        new Thread(()-> System.out.println("square :"+(num*num))).start();
                    }  
                            else {
                                new Thread(()->System.out.println("cube :"+(num*num*num))).start();
                            }
                        
                            try {
                                Thread.sleep(1000);
                                
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        });
                        t1.start();
                    }
                }