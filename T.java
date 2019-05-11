
public class T {
    public int a;
    public int b;
    public int c;
    public void show(){
        System.out.println("Hello HImu");
    }
    public void show(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("a:"+a+" "+"b:"+b);
    }
    public int show(int a,int b,int c){
        int sum;
        this.a=a;
        this.b=b;
        this.c=c;
        
        return (a+b+c);
      
    }
    
    
    public static void main(String[] args){
        T t=new T();
        t.show();
        t.show(34,56);
        int sum=t.show(45, 56, 5);
        System.out.println(sum);
    }
}
