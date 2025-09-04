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
  class C extends A{
    public void mul(int a ,int b){
  System.out.println("multiply of 2 number is "+(a*b));
  }
  }
  public class Hierarchial{
   public static void main(String args[]){ 
    C obj=new C();
	B obje=new B();
	obj.add(10,4);
	obj.mul(10,8);
	obje.sub(9,8);
	}
	}