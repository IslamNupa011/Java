
import java.util.Scanner;


public class IfElse1 
{
    public static void main(String[] args)
    {
        int number;
        System.out.println("Enter A Number");
        Scanner sc = new Scanner (System.in);
        number =sc.nextInt();
        
        if(number>50)
        {
            System.out.println("Number Is Greater Than 50");
        }
        else
        {
            if(number<50)
            {
                System.out.println("Number Is Less Than 50");
            }
            else
            {
                System.out.println("The Number Is Equal To 50");
            }
            
        }
    }
    
    
    
    
}
