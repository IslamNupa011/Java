
class Bird
{
    public void fly()
    {
        System.out.println("Birds Can Fly");
    }
    
}


public class BirdArrayTest
{
    public static void main(String[] args)
    {
        Bird[] myArray = new Bird[3];
        for(int i=0;i<3;i++)
        {
            myArray[i] = new Bird();
        }
        for(int i=0;i<3;i++)
        {
            System.out.println("Object : " + (i+1) + " , ");
                    myArray[i].fly();
        }
    }
    
}
