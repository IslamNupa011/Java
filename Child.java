
 class Parent 
 { 
 //public int a; 
 //public int b; 
 
 public int a = 10; 
 public int b = 20; 
 
 public void show() 
 { 
 System.out.println("Printing from parent class:"); 
 
 System.out.println("a = " + a); 
 System.out.println("b = " + b); 
 } 
 } 


public class Child extends Parent
{
     public static void main(String[] args) 
 { 
 Child child = new Child(); 
 
 child.show(); 
 
 System.out.println("Printing from child class:"); 
 System.out.println("a = " + child.a); 
 System.out.println("b = " + child.b); 
 } 

    
}
