class Cplusplus{
    public void  color(){
        System.out.println("I m from parent class- C++");
    }
}
public class Java extends Cplusplus {
    
    public void color(){
         super.color();
         System.out.println("I m from child class-java");
        // super.color();
    }
    public static void main(String[] args){
        Java obj=new Java();
        obj.color();
    }
}
