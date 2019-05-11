class Parent_Inheritance{
    public int a=30;
    public int b=40;
    public void display(){
        System.out.println(a+" "+b);
    }
    
    
}

public class Inheritance extends Parent_Inheritance {
    public int c=60;
    public static void main(String[] args){
        
        Inheritance obj=new Inheritance();
        obj.display();
        System.out.println(obj.a+" "+obj.b+" "+obj.c);
    }
}
