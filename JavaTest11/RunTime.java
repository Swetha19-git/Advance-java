class Add{
    public void add(int a,int b){
    System.out.println("Sum is "+(a+b));
}
}
class sub extends Add{
@Override
public void add(int a ,int b){
    super.add(a,b);
    System.out.println("Subraction is "+(a-b));
}
}


  
public class Runtime_polymorphism {
      public static void main(String args[]){
        sub s=new sub();
        s.add(10,8);
        
    }
    
}
