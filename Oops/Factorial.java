class Factorial{
 public int getFactorial(){
   int n=5;
   int fact=1;
   for(int i=1;i<=n;i++){
    fact=fact*i;
	}
	return fact;
  }
  public static void main(String args[]){
   Factorial f=new Factorial();
   int num=f.getFactorial();
   System.out.print("factorial number is "+num);
   
 }
 }
    