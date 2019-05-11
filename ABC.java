
public class ABC 
{ 
public int a; 
public int b; 

public void setValue() 
{ 
a = 1; 
b = 2; 
} 
public void setValue(int a) 
{ 
this.a = a; 
b = 2; 
} 
public int setValue(int a, int b) 
{ 
this.a = a; 
this.b = b; 

return (a + b); 
} 

public static void main(String[] args) 
{ 
ABC abc = new ABC(); 

abc.setValue(); 
System.out.println("a = " + abc.a); 
System.out.println("b = " + abc.b); 

abc.setValue(10); 
System.out.println("a = " + abc.a); 
System.out.println("b = " + abc.b); 

int sum = abc.setValue(10, 20); 
System.out.println("a = " + abc.a); 
System.out.println("b = " + abc.b); 
System.out.println("sum = " + sum); 
} 
} 

