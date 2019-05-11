class Mann{
    public String name;
    public Mann(String name){
        this.name=name;
    }
    public void show(){
        System.out.println("Name is:"+name);
    }
    
}
class SuperMann extends Mann {
   
    public int age;
    
    public SuperMann(int age){
        super("nupas");
        this.age=age;
    }
    public void show(){
        super.show();
        System.out.println("Age is:"+age);
    }
    public static void main(String [] args){
        SuperMann obj=new SuperMann(12);
        obj.show();
    }
}
