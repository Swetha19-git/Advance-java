class Reverse{
 public  int getSquare(int n){
  int sum=0;
  int last=0;
  while(n>0){
   last=n%10;
   sum=sum*10+last;
   n=n/10;
   }
   return sum;
  }
  public static void main(String args[]){
   
   Reverse s=new Reverse();
   int num=1462;
   System.out.println("given number is" +num);
   System.out.println(s.getSquare(num));
   }
   }