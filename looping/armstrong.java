import java.util.*;
class armstrong{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter number");
int n=sc.nextInt();
int a=n;
int rev=0;
int last=0;
int arm=0;
while(n>0){
last=n%10;
arm=last*last*last;
rev=rev+arm;
n=n/10;
}
if(a==rev)
System.out.print(a +" is armstrong");
else
System.out.print(a +" is not armstrong");
}
}
