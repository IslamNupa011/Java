
 class Employee1 
 { 
 public String name; 
 public int salary; 

public Employee1(String name, int salary) 
{ 
this.name = name; 
this.salary = salary; 
} 

public void showDetails() 
{ 
System.out.println("Name: " + name + "\tSalary: " + salary); 
} 
} 

public class Manager1 extends Employee1 
{ 
public String department; 
public Manager1(String department) 
{ 
super("Hasan", 100000); 
this.department = department; 
} 
@Override
public void showDetails() 
{ 
super.showDetails(); 
System.out.println("Department: " + department); 
//super.showDetails(); 
} 
public static void main(String[] args) 
{ 
Manager1 manager1 = new Manager1("Engineering"); 

manager1.showDetails(); 
} 
}


