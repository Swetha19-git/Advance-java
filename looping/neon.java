import java.util.*;
class neon{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter number");
int num=sc.nextInt();
int a=num;
int square= num*num;
int last,sum=0;
while(square>0){
last=square%10;
sum=sum+last;
square=square/10;
}
System.out.println(sum);
if(a==sum)
System.out.println("it is neon number");
else
System.out.println("not neon number");
}
}