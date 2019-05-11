
public class BlockTest
{
    public BlockTest()
    {
        System.out.println("Constructor Executed");
    }
    
    {
        System.out.println("Block Executed");
    }
    
    {
        System.out.println("Outer Statement Is Executed");
        {
            System.out.println("The Inner Statement Is Executed");
        }
    }
    public void method()
    
    {
        System.out.println("Method Executed");
    }
    public static void main(String[] args)
    {
        BlockTest bt = new BlockTest();
        bt.method();
    }
}
