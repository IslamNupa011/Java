
import java.util.Random;


public class MatrixMautiplication 
{
    public static void main(String[] args)
    {
        Random random = new Random();
        
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        
        for(int i=0 ;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=random.nextInt(50);
            }
        }
        for(int i=0 ;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                b[i][j]=random.nextInt(50);
            }
        }
        for(int i=0 ;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=(a[i][0]*b[0][j])+(a[i][1]*b[j][1])+(a[i][2]*b[2][j]);
            }
        }
        System.out.println("The Multiplied Matrix C");
        for(int i=0 ;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(c[i][j]+ " ");  // If we use println then it will produce a new line by default
               
                        
            }
            System.out.println();
        }
        
        
    }
    
}
