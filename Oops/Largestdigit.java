class Largestdigit{
 public int getLargestDigit(){
   int n=496;
   int a=n;
   int max=0;
   int last=0;
   while(n>0){
     last= n%10;
	 if(last>max){
	  max=last;
	  }
	 n=n/10;
	 }
	 System.out.println("The number is" +a);
	return max;
  }
  public static void main(String args[]){
   Largestdigit f=new  Largestdigit();
   int num=f.getLargestDigit();
   System.out.print("Largest number is "+num);
   
 }
 }