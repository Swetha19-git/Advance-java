class Add{
    public void add(int a,int b,int c){
    System.out.println("Sum is "+(a+b+c));
}
}
class Sub extends Add{
public void sub(int a ,int b){
    System.out.println("Subraction is "+(a-b));
}
}

public class Compiletime_polymorphism {
    public static void main(String args[]){
        Sub s=new Sub();
        s.add(5,6,7);
        s.sub(9,8);
        
    }
    
}
