class Operations{
 
 int c;
 int d;
 
 public void add(int a,int b){
  int c=a+b;
  this.c=c;
  System.out.println("additon of two numbers is "+c);
  }
   public void sub(int a,int b){
  int d=a-b;
  this.d=d;
  System.out.println("subtraction of two numbers is "+d);
  }
   public void mul(){
 
  System.out.println("Multiplication of two numbers is "+(c*d));
  }
  public void divide(){
 
  System.out.println("Division of two numbers is "+(c/d));
  }
  public static void main(String args[]){
   Operations a=new Operations();
   a.add(10,5);
   a.sub(10,5);
   a.mul();
   a.divide();
   }
   }
   