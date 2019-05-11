
package code_fo_rfinall;


public class TestExceptionB {
    public static void main(String[] args){
        int sum=0;
        for(int i=0;i<args.length;i++){
            try{
                sum+=Integer.parseInt(args[i]);
            }
            
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Sum:"+sum);
        }
    }
}
