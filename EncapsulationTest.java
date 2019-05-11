class MyNumber 
 { 
 private int number; 
 
 public void setNumber(int number) 
 { 
 this.number = number; 
 } 
 
 public int getNumber() 
 { 
 return number; 
 } 
 } 




public class EncapsulationTest
{
    public static void main(String[] args) 
 {  
 MyNumber myNumber = new MyNumber();  
 myNumber.setNumber(10); 
 System.out.println( myNumber.getNumber() ); 
 
 myNumber.setNumber(30); 
 System.out.println( myNumber.getNumber() ); 
 } 

    
}
