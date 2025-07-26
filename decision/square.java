import java.util.*;
class square{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter length:");
int a=sc.nextInt();
System.out.println("enter breadth:");
int b=sc.nextInt();
if(a==b)
System.out.println("it is square");
else  if(a!=b)
System.out.println("it is rectangle");
else
System.out.println("enter valid numbers");
}
}
