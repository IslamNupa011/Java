
class Ferrari
{
    public void show()
    {
        System.out.println("I Am Ferrari");
    }
    
}

class Tesla
{
   public void show()
    {
        System.out.println("I Am Tesla");
    } 
}

class BMW
{
    public void show()
    {
        System.out.println("I Am BMW");
    }
}

class Toyota
{
    public void show()
    {
        System.out.println("I Am Toyota");
    }
}



public class TestInstanceof1 
{
    // Instanceof Is An Operatot that will check which class the object belongs
    public void test(Object object)
    {
        if(object instanceof Ferrari)
        {
            System.out.println("Object Is Of Ferrari Class");
            
        }
        else
        {
            if(object instanceof  Tesla)
            {
                System.out.println("Object Is Of Tesla Class");
            }
            else
            {
                if(object instanceof BMW)
                {
                    System.out.println("Object Is Of BMW Class");
                }
                else
                {
                    if(object instanceof Toyota )
                    {
                        System.out.println("Object Is Of Toyota");
                        
                    }
                    else
                    {
                        System.out.println("Object Is None Of Ferrari,Tesla,BMW,Toyota");
                    }
                }
                
            }
            
        }
        
    }
    public static void main(String[] args)
    {
        Ferrari object1 = new Ferrari();
        Tesla object2 = new Tesla();
        BMW object3 = new BMW();
        Toyota object4 = new Toyota();
        
        TestInstanceof1 t = new TestInstanceof1();
        t.test(object1);   
        t.test(object2);
        t.test(object3);
        t.test(object4);
    }
    
}
