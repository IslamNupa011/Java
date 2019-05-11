
public class TestStatic
{
    public static int counter = 10;
    
    public static void increamentCounter()
    {
        counter++;
    }
    public static void main(String[] args)
    {
        // In Static method we don t need to create an object
        // We can not use a not- static variable in a static method
        // We can not overrride static method 
        // we can use    Static variables , Static methods , Static block , Static inner block
        System.out.println("Counter: "+counter);
        increamentCounter();
        System.out.println("Counter: "+counter);
        System.out.println("----------------------");
        
        TestStatic t1 = new TestStatic();
        TestStatic t2 = new TestStatic();
        System.out.println(t1.toString());
        System.out.println(t2.toString());
         System.out.println("----------------------");
         
         System.out.println("Counter "+t2.counter);
        t2.counter++;
        //counter++;
        System.out.println("Counter "+t1.counter);
        
    }
    
}
