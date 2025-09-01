class Maxnumber2{
 public  int getMax(int n1,int n2,int n3){
  if(n1>n2 &&  n1>n3)
  return n1;
  else if(n2>n1 &&  n2>n3)
  return n2;
  else
  return n3;
  }
  public static void main(String args[]){
   
   Maxnumber2 s=new Maxnumber2();
   int num1=10;
   int num2=30;
   int num3=90;
   System.out.println("Two numbers are "+num1 +" and "+num2 +" and "+num3);
   System.out.println("maximum is " + s.getMax(num1,num2,num3));
   }
   }