import java.util.*;
class niven{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter number");
int n=sc.nextInt();
int a=n;
int sum=0;


int last=0;
while(n>0){
last=n%10;
sum=sum+last;
n=n/10;
}
int niven=sum%a;
if(niven==0)
System.out.print(a +" is niven number");
else
System.out.print(a +" is not niven number");
}
}