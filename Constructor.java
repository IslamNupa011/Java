
public class Constructor {
    public int a;
    public Constructor(int a){
        this.a=a;
    }
    public void show(){
        System.out.println(a);
    }
    
    public static void main(String[] args){
        Constructor object=new Constructor(12);
        object.show();
    }
}
