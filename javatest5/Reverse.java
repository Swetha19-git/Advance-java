class Reverse{
 public int reverseNumber(int n){
  int last=0;
  int rev=0;
  while(n>0){
   last=n%10;
   rev=rev*10+last;
   n=n/10;
   }
   return rev;
 }
 public static void main(String args[]){
  Reverse r=new Reverse();
  int num=1234;
  System.out.print(r.reverseNumber(num));
  
  }
  }