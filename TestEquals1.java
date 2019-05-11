
public class TestEquals1 
{
    public int a;
    public int b;
    
    public TestEquals1(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    
    public static void main(String[] args)
    {  
        // The EQuals Method
        TestEquals1 t1 = new TestEquals1(5,10) ;
        TestEquals1 t2 = new TestEquals1(5,10) ;
        
        if(t1==t2)   // Checking with equal operator
        {
            System.out.println("T1 is indentical to T2");
        }
        else
        {
            System.out.println("T1 is not identical to T2");
        }
        if(t1.equals(t2))   // Checking with equal method
        {
            System.out.println("T1 is equal to T2");
        }
        else
        {
            System.out.println("T1 is not equal to T2");
        }
        
        System.out.println("Setting t1=t2");
        t1=t2;
        if(t1==t2)  // Checking with equal operator
        {
            System.out.println("t1 is identical to t2");
        }
        else
        {
            System.out.println("t1 is not equal to t2");
        }
        if(t1.equals(t2))  // Checking with equal method
        {
            System.out.println("t1 is equal to t2");
        }
        else
        {
            System.out.println("t1 is not equal to t2");
        }
        
   
    }
    
}
