import java.util.*;
class palindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter number");
int n=sc.nextInt();
int a=n;
int rev=0;
int last=0;
while(n>0){
last=n%10;
rev=rev*10+last;
n=n/10;
}
if(a==rev)
System.out.print(a +" is palindrome");
else
System.out.print(a +" not is palindrome");
}
}