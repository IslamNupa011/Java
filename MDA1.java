
public class MDA1 
{
    public static void main(String[] args)
    {
        int[][] myArray = new int [3][3];
        for(int i=0;i<myArray.length;i++)
        {
            for(int j=0;j<myArray[i].length;j++)
            {
                myArray[i][j]=(i+j+10);
            }
        }
        System.out.println("The Array");
        for(int i=0;i<myArray.length;i++) // myArray.length works in the row
        {
            for(int j=0;j<myArray[i].length;j++)  // myArray[i]/length works in the column
            {
                System.out.println(myArray[i][j] + " ");
                        
                
            
                
            }
            System.out.println();
        }
    }
    
}
