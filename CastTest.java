

public class CastTest {
    public static void main(String[] args){
        long bigvalue=99L;
        int smallvalue=(int) bigvalue;
        System.out.println(smallvalue);
        smallvalue=50;
        bigvalue=smallvalue;
        System.out.println(bigvalue);
                
        
    }
}
