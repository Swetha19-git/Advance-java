import java.util.*;
class salary{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter product name:");
String name=sc.next();
System.out.println("enter product price:");
int price =sc.next();
System.out.println("enter quantity:");
int quantity =sc.next();
int total= price+0.18;
System.out.println(" product name:" + name);
System.out.println(" product price:" + price);
System.out.println(" product quantity:" + quantity);
System.out.println(" total amount with 18% gst:" + total);
}
}
