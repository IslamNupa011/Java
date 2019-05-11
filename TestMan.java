class Man2
{
    public void fly()
    {
        System.out.println("Man Can not fly");
    }
    
}

class Superman extends Man2
{
    public void fly()
    {
        System.out.println("SuperMan Can  fly");
    }
}

class Spiderman extends Man2
{
     public void fly()
    {
        System.out.println("SpiderMan Can not  fly but jump");
    }
}



public class TestMan 
{
    // Polymorphism
    // Creating object of parent class by the constructor of child class
    public static void main(String[] args)
    {
        Man2 man1 = new Man2();
        man1.fly();
        
        Man2 man2 = new Superman();
        man2.fly();
        
        Man2 man3 = new Spiderman();
        man3.fly();
        
        
    }
}
