
class Hello
{
    public void display(){
            System.out.println("Welcome To Java");
    }
}


public class Welcome2 {
    
    public static void main(String[] args){
        
        Hello a = new Hello();
        Hello b = new Hello(); 
        a.display();
        b.display();
    }
    
}
