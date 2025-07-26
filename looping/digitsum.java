import java.util.*;
class digitsum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter number");
int n=sc.nextInt();
int a=n;
int sum=0;
int prod=1;

int last=0;
while(n>0){
last=n%10;
sum=sum+last;
prod=prod*last;
n=n/10;
}
int digitsum=sum+prod;
System.out.print(digitsum);
if(digitsum==a)
	System.out.println("correct");
}
}