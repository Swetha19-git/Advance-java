import java.util.*;
class temp{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter Temperature:");
int t=sc.nextInt();
if(t<0)
System.out.println("It is freezing weather");
else if(t>=0&&t<=10)
System.out.println("It is very cold weather");
else if(t>10&&t<=20)
System.out.println("It is cold weather");
else if(t>20&&t<=30)
System.out.println("It is normal weather");
else if(t>30&&t<=40)
System.out.println("It is hot weather");
else if(t>40)
System.out.println("It is very hot weather");
}
}