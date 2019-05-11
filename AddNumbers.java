
public class AddNumbers 
{
    public int number1;
    public int number2;
    public int sum;
    
    public AddNumbers(int number1,int number2)
    {
        this.number1 = number1;
        this.number2 = number2;
    }
    public void add()
    {
        sum = number1+number2;
        System.out.println("Sum : " + sum);
    }
    
    
    public static void main(String[] args)  // Main Method
    {
        AddNumbers addnumbers = new AddNumbers(10,20);  //Creating An Object
        addnumbers.add();   // Calling The Method - > add
    }
    
}
