
import java.util.Random;    // Header file to generate Random number


public class RandomNumber1
{
    public static void main(String[] args)
    {
        int number;
        Random random = new Random();  // creating object named random via Random class
        number = random.nextInt(100);   // generating random nuber from 0 to 99 range
        System.out.println(number);
    }
    
}
