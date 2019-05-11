
package FinalCodes;

public class MyThread extends Thread{
    
    public void run(){
        int i=1;
        while(i<=100){
            System.out.println("I:  "+i);
            i++;
        }
        
    }
    
    public static void main(String[] args){
        
        
        Thread t1 = new MyThread();  // polymorphism approach
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();
        
        t1.start();
        t2.start();
        t3.start();
    }
    
    
    
}

