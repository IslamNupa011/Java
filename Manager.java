
 class Employee 
 { 
 public String name = "Hasan"; 
 public int salary = 100000; 
 
 public void showDetails() 
 { 
 System.out.println("Name: " + name + "\tSalary: " + salary); 
 } 
 } 
 
 public class Manager extends Employee 
 { 
 public String department = "Engineering"; 
 
 public void showDetails() 
 { 
 super.showDetails(); 
 System.out.println("Department: " + department); 
 //super.showDetails(); 
 } 
 
 public static void main(String[] args) 
 { 
 Manager manager = new Manager(); 
 
 manager.showDetails(); 
 } 
 } 

