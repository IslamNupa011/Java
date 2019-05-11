
package code_fo_rfinall;


public class DeclareException {
     public void methodA(){
        try{
            
        }catch(Exception e){
            System.out.println("If Error In Try,Catch Execute");
        }finally{
            System.out.println("Finally Must Execute");
        }
               
    }
    public void methodB() throws SecurityException{
        
    }
    public void methodC() throws SecurityException,Exception{
        
    }
    public static void main(String[] args){
        
    }
    
}
