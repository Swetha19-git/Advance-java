class Reverse{
 public int reverseNumber(){
   int n=1234;
   int a=n;
   int rev=0;
   int last=0;
   while(n>0){
     last= n%10;
	 rev=rev*10+last;
	 n=n/10;
	 }
	 System.out.println("The original num is" +a);
	return rev;
  }
  public static void main(String args[]){
  Reverse f=new Reverse();
   int num=f.reverseNumber();
   System.out.print("Reverse number is "+num);
   
 }
 }