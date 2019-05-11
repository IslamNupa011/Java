class Manager{
  public int salary=100000;
  public String name="Nupa";
  public void showdetails(){
      System.out.println("salary:"+ salary+ " " +"\nname:"+name);
  }  
}
public class Employee extends Manager{
    public String department="CSE";
    public void showdetails(){
        super.showdetails();
        System.out.println("department:"+department);
    }
    public static void main(String[] args){
        Employee employee=new Employee();
        employee.showdetails();
    }
}
