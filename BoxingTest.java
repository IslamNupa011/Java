
public class BoxingTest
{
    public void boxing(int primitiveInteger) 
 { 
 Integer wrapperInteger = new Integer(primitiveInteger);//boxing 
 
 int number = wrapperInteger.intValue();//unboxing 
 System.out.println(number); 
} 
 
 public void autoboxing(int primitiveInteger) 
 { 
 Integer wrapperInteger = primitiveInteger;//autoboxing 
 
 int number = wrapperInteger;//autounboxing 
 System.out.println(number); 
 } 
 
 public static void main(String[] args) 
 { 
 BoxingTest boxingTest = new BoxingTest(); 
 
 boxingTest.boxing(100); 
 boxingTest.autoboxing(200); 
 } 

    
}
