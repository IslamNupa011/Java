public class BoxingTest2{
   public void boxing(int primitiveInteger){
       Integer wrapperInteger=new Integer(primitiveInteger);
       int number=wrapperInteger.intValue();
       System.out.println(number);
       
   } 
   public void unboxing(int primitiveInteger){
       Integer wrapperInteger=primitiveInteger;
       int number=wrapperInteger;
       System.out.println(number);
   }
   public static void main(String[] args){
       BoxingTest boxingtest=new BoxingTest();
       boxingtest.boxing(23);
       boxingtest.unboxing(545);
   }
}
