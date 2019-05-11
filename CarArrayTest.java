
class Car
{
    public String carName;
    public String carModel;
    
    public Car(String carName,String carModel)
    {
        this.carName = carName;
        this.carModel = carModel;
    }
    public void display()
    {
        System.out.println("Name :" + carName + "\tModel : " + carModel);
    }
}

public class CarArrayTest 
{
    public static void main(String[] args)
    {
        Car[] myArray = new Car[3];
        myArray[0] = new Car("Ferrari","Ferrari 488 GTB");
        myArray[1] = new Car("Tesla","Model 3");
        myArray[2] = new Car("BMW","BMW i8");
        for(int i=0;i<3;i++)
        {
            myArray[i].display();
        }
    }
    
}
