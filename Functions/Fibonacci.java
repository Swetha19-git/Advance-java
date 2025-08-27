import java.util.*;
class Fibo_num {
 public boolean isfibonacci(int n){
  int a=0;int b=1;
  while(a<=n){
   if(a==n){
     return true;
	 }
	 int c=a+b;
	 a=b;
	 b=c;
	 }
	 return false;
 }
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number:");
  int n=sc.nextInt();
  Fibo_num f= new Fibo_num();
  if(f.isfibonacci(n)==true)
   System.out.println("Given number is fibonacci");
   else
   System.out.println("Given number is not fibonacci");
  }
  }
