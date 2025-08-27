import java.util.*;
class Harshad_num {
 public boolean isHarshad(int n){
int temp=n;
int last=0;
int sum=0;
while(n>0){
 last=n%10;
   sum=sum+last;
   n=n/10; 
 }
 if(temp%sum==0)
 return true;
 else
 return false;
 }
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number:");
  int n=sc.nextInt();
  
  Harshad_num f= new Harshad_num();
  if(f.isHarshad(n))
   System.out.println("Given number is Harshad number");
   else
   System.out.println("Given number is not Harshad number");
   
  
  
  
  }
  }