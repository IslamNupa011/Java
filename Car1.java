abstract class Vehicle
{
   public String model = "Tesla Model 3";
   public String year = "2017";
   
   public abstract void goFast();
   
   public void show()
   {
       System.out.println("Model: "+model);
       System.out.println("Year: "+year);
   }
}
  


public class Car1 extends Vehicle
{
    // Abstract class has no body
    //An Abstract class must have at least one abstract method
    // Abstract Class can not be implemented
    //Abstract class can be extened
    
    public void goFast()
    {
        System.out.println("Car Can Go Fast");
    }
    public static void main(String[] args)
    {
        //Vehicle vehicle = new Vehicle() ;
        Car1 car1 = new Car1();
        car1.show();
        car1.goFast();
    }
    
}
