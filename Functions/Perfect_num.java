import java.util.*;
class Perfect_num {
 public boolean isPerfect(int n){
  int sum=0;
  for(int i=1;i<=n/2;i++){
    if(n%i==0){
	 sum=sum+i;
	 }
	 }
	 return sum==n;
	 
 }
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number:");
  int n=sc.nextInt();
  
  Perfect_num f= new Perfect_num();
  if(f.isPerfect(n))
   System.out.println("Given number is Perfect number");
   else
   System.out.println("Given number is not Perfect number");
   
  
  
  
  }
  }