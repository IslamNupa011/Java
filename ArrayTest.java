
public class ArrayTest
{
    public static void main(String[] args)
    {
        int[] myArray;
        myArray = new int[5];
        for(int i=0;i<5;i++)
        {
            myArray[i]=(100+i);
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(myArray[i]);
        }
    }
    
}
