
package FinalCodes;

public class ThreadTest implements Runnable{

    @Override
    public void run() {
        
        int i = 1;
        while(i<=100){
            System.out.println("I: "+i);
            i++;
        }
       
    }
    
    
    public static void main(String[] args){
        ThreadTest t = new ThreadTest();
        
        Thread t1 = new Thread(t);
         Thread t2 = new Thread(t);
          Thread t3 = new Thread(t);
          t1.start();
           t2.start();
            t3.start();
        
    }
    
}

