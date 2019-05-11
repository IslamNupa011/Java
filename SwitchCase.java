
public class SwitchCase 
{
    
    public void method(int number)
    {
        switch(number)
        {
            case 1:
                System.out.println("Shakib Al Hasan Is The Number One All ROunder");
                break;
            case 2:
                System.out.println("Shakib Can Hit Big Shots");
                break;
            case 3:
                System.out.println("Shakib Is A Legend");
                break;
            default :
                System.out.println("Shakib Has Jerssey Number 75");
        }
        
    }
    
    public static void main(String[] args)
    {
        SwitchCase sc = new SwitchCase();
        sc.method(5);
    }
    
}
