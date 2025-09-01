class Maxnumber{
 public  int getMax(int n1,int n2){
  if(n1>n2)
  return n1;
  else
  return n2;
  }
  public static void main(String args[]){
   
   Maxnumber s=new Maxnumber();
   int num1=10;
   int num2=30;
   System.out.println("Two numbers are "+num1 +" and "+num2);
   System.out.println("maximum is " + s.getMax(num1,num2));
   }
   }