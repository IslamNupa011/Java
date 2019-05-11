
package FinalCodes;

class MyStack{
    
    private int idx =0;
    private char [] data = new char[6];  // character arrray
    
    
    public synchronized void push(char c){
        this.notify();   // notify () is a built in method  works for thread
        
        if(idx!=5){
            data[idx] = c;
            idx++;
        }
    }
    
    public synchronized char pop(){
        
        if(idx == 0 ){
            /*
            idx == 0 means stack is empty ,so synchronized will send pop() to wait , and notify push to send data to the stack
            */
            try{
                this.wait();  // wait is a built in method , works for thread
            }catch(Exception e){
                e.printStackTrace();
                
            }
            
        }
         idx--;
            return data[idx];
    }
}

class Producer implements Runnable{
    
    private MyStack stack;
    
    public Producer(MyStack s){
        stack = s;
    }

    @Override
    public void run() {
        char c;
        
        for(int i=0 ;i<50;i++){
            c = (char)(Math.random()*26+'A');
           
            stack.push(c);
           
            System.out.println("Pushed Into The Stack: "+c);
            try{
                Thread.sleep((int)(Math.random()*300));
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}

class Consumer implements Runnable{
    
    private MyStack stack;
    
    public Consumer(MyStack s){
        stack = s;
    }

    @Override
    public void run() {
        char c;
      
         for(int i=0 ;i<50;i++){
            c = (char)(Math.random()*26+'A');
          
            stack.pop();
            
            System.out.println("Poped From The Stack: "+c);
            try{
                Thread.sleep((int)(Math.random()*300));
            }catch(Exception e){
                e.printStackTrace();
            }
        }
       
    }
    
}
public class StackTest {
    
    public static void main(String[] args){
        MyStack s =  new MyStack();
        
        Producer p = new Producer (s);
        Thread t1 = new Thread(p);  // thread for push
        t1.start();  // push thread starts 
        
        Consumer c = new Consumer(s);
         Thread t2 = new Thread(c); //  thread for pop
         t2.start();  // pop thread stats
    }
    
}

