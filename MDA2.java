
public class MDA2 
{
    public static void main(String[] args)
    {
        int [][] myArray = new int[3][];
        myArray[0] = new int[5];     // row 1 has 5 columns
        myArray[1] = new int[3];    //  row 2 has 3 columns
        myArray[2] = new int[4];   //   row 3 has 4 columns
        
        for(int i=0;i<myArray.length;i++)
        {
            for(int j=0;j<myArray[i].length;j++)
            {
                myArray[i][j]  = (i+j+10);
            }
        }
        for(int i=0;i<myArray.length;i++)
        {
            for(int j=0;j<myArray[i].length;j++)
            {
                System.out.println(myArray[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}