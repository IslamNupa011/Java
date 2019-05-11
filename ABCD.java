public class ABCD 
{ 
public int a; 
public int b; 
public ABCD() 
{ 
a = 1; 
b = 2; 
} 
public ABCD(int a) 
{ 
this.a = a; 
b = 2; 
} 
public ABCD(int a, int b) 
{ 
this.a = a; 
this.b = b; 
} 

public static void main(String[] args) 
{ 
ABCD object1 = new ABCD(); 
System.out.println("a = " + object1.a); 
System.out.println("b = " + object1.b); 

ABCD object2 = new ABCD(10); 
System.out.println("a = " + object2.a); 
System.out.println("b = " + object2.b); 

ABCD object3 = new ABCD(10, 20); 
System.out.println("a = " + object3.a); 
System.out.println("b = " + object3.b); 
} 
} 

