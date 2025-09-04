class A{
 public void add(int a ,int b){
  System.out.println("sum of 2 number is "+(a+b));
  }
  }
  class B extends A{
   public void sub(int a ,int b){
  System.out.println("subtraction of 2 number is "+(a-b));
  }
  }
  public class simple{
   public static void main(String args[]){
    B obj=new B();
	obj.add(10,5);
	obj.sub(10,5);
	}
	}
