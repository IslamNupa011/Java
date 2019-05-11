
package code_fo_rfinall;


public class Test_Finally {
    public static void main(String[] args){
         try{
                int i=9/0;
                System.out.println(i);
            }
            catch(ArithmeticException e1){
                System.out.println("Arithmetic exception."+e1);
            }
         finally{
             System.out.println("FInal block must execute");
         }
    }
}
