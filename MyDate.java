
public class MyDate
{
    public int day;              // Variable
    public int month;            // Variable
    public int year;             // Variable
    
    public MyDate()               //  This Is Called Constructor [Starting]
  
    {
        day = 1;
        month = 6;
        year = 1979;
    }                        // [Ending]
    
    public void showdate()                    // This Is Called Creating A Method [Starting]
    {
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
    }                                         //[Ending]
    
    public static void main(String[] args)
    {
        MyDate date = new MyDate();   // date is an Object
        date.showdate(); 
    }
}
