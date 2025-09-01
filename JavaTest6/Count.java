class Count{
 public  int getCount(int n){
  int sum=0;
  int last=0;
  while(n>0){
   last=n%10;
   sum=sum+1;
   n=n/10;
   }
   return sum;
  }
  public static void main(String args[]){
   
   Count s=new Count();
   int num=1462;
   System.out.println("given number is" +num);
   System.out.println(s.getCount(num));
   }
   }