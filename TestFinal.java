
public class TestFinal
{
    public final int a=10;
    public final int b;
    public TestFinal(int b)
    {
        this.b = b;
    }
    public final void show()
    {
     System.out.println("Final Method Can Not Be Overrided");   
    }
    public final void show (int number)
    {
        System.out.println("Final Method Can Be Overloaded");
        
    }
    public static void main(String[] args)
    {
        TestFinal testFinal = new TestFinal(20);
        System.out.println("A: "+testFinal.a);
        System.out.println("B: "+testFinal.b);
        testFinal.show();
        testFinal.show(10);
        
        final int number;
        number=100;
        System.out.println("Number: "+number);
       // number=200;   // This line will show error , because we can not use a final variable again
        
    }
    
    
    
}
