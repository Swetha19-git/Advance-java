import java.util.*;
class Strong_num {
 public boolean isStrong(int n){
int temp=n;
int last=0;
int sum=0;
while(n>0){
 last=n%10;
 int fact=1;
 for(int i=1;i<=last;i++){
  fact=fact*i;
   }
   sum=sum+fact;
   n=n/10; 
 }
 return sum==temp;
 }
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number:");
  int n=sc.nextInt();
  
  Strong_num f= new Strong_num();
  if(f.isStrong(n))
   System.out.println("Given number is Strong number");
   else
   System.out.println("Given number is not Strong number");
   
  
  
  
  }
  }