

import java.util.Scanner; // Imprting Header File ,It has the Class file named Scanner
public class InputData 
{
    public static void main(String[] args)
    {
        int number; // Declaring A Variable
     
        System.out.println("Input A Number ");
        Scanner a = new Scanner(System.in);  // Creating An Object Of Scanner Class
        number = a.nextInt();  // Storing The Inputted Value In The Variable Called number
        System.out.println("Your Inputted Number: " + number);
    }
    
}
