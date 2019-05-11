
import java.util.Random;


public class RandomNumber2 
{
    public static void main(String[] args)
    {
        int number;
        Random random = new Random();
        for(int i=1;i<=10;i++)
        {
            number = random.nextInt(150);
            System.out.println("Number : "+i+". "+number);
        }
    }
    
}
