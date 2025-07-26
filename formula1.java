import java.util.*;
class a2{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter breadth:");

int b=sc.nextInt();
System.out.println("Enter height:");

int h=sc.nextInt();
int area= b*h*1/2;
System.out.println("your breadth is: " +b);
System.out.println("your height is: " +h);
System.out.println("your area is: " +area);
}
}