
public class FibonacciSeries
{
    public static void main(String[] args)
    {
        int a=0;
        int b=1;
        System.out.println("The Fibonacci Serices ");
        for(int i=1;i<=10;i++)
        {
            System.out.println(i + " " +a);
            a=a+b;
            b=a-b;
        }
        
    }
}