class Parent{
    public void show(){
        System.out.println("java from parent class");
    }
}
public class Polymorphisom extends Parent {
    public void show(){
        System.out.println("java");
    }
    public static void main(String[] args){
        Parent obj=new Polymorphisom();
        obj.show();
    }
    
}


