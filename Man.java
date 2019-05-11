
public class Man 
{
    
    public boolean teachAI;
    public boolean teachSPL;
    
    
    public Man(boolean teachAI,boolean teachSPL)
    {
        this.teachAI = teachAI;
        this.teachSPL = teachSPL;
    }
    
    public void display()
    {
        if(teachAI == true && teachSPL == true)
        {
            System.out.println("Cmr Teach Both");
        }
        if(teachAI == true )
        {
            System.out.println("Cmr Teach AI");
        }
        if(teachSPL == true)
        {
            System.out.println("Cmr Teach SPL");
        }
        if(teachAI == true && teachSPL == true)
        {
            System.out.println("Hasan Teach Both");
            
        }
        
    }
    public static void main(String[] args)
    {
        Man cmrSir = new Man(true,false);
        Man hasanSir = new Man(true,false);
        cmrSir.display();
        hasanSir.display();
        
    }
    
    
}
