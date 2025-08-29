class Max{
 public int getMax(int x,int y){
  if(x>y)
  return x;
  else
  return y;
  }
  public static void main(String args[]){
   Max m=new Max();
   int a=10;
   int b=20;
   int c=m.getMax(a,b);
   System.out.println("element a is "+a);
   System.out.println("element b is "+b);
   System.out.println("The greatest of 2 element is "+c);
   }
}
