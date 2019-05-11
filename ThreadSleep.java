
package FinalCodes;


public class ThreadSleep implements Runnable {

  
    public void run() {
        int i = 1;
        while(i<=100){
            System.out.println("I: "+i);
            i++;
           try{
               Thread.sleep(300);
           }
           catch(Exception e){
               System.out.println(e);
           }
        }
        
    }
    public static void main(String[] args){
        ThreadSleep ts = new ThreadSleep();
        
        Thread t1 = new Thread(ts);
         Thread t2 = new Thread(ts);
          Thread t3 = new Thread(ts);
          t1.start();
           t2.start();
            t3.start();
        
    }
    
}
