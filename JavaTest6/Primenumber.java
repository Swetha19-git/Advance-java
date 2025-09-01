class Primenumber{
 public  int getPrime(int n){
 int count=0;
  for(int i=2;i<n;i++){
  if(n%2==0)
	  count=count+1;
  }
  if(count==0)
	  return 1;
  else
   return 0;
  }
  public static void main(String args[]){
   
   Primenumber s=new Primenumber();
   int num=5;
   System.out.println(num);
   if(s.getPrime(num)==1)
   System.out.println("Prime number");

   }
   }