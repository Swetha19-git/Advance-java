import java.util.*;
class switchcase{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter a");
int a= sc.nextInt();
System.out.println("enter b");
int b= sc.nextInt();
System.out.println("enter c");
String c = sc.next();
switch(c){
case "addition":
System.out.println("add a and b" + (a+b));
break;
case "subtraction":
System.out.println("sub a and b" + (a-b));
break;
case "multiplication":
System.out.println("multiply a and b" + (a*b));
break;
case "division":
System.out.println("divide a and b" + (a/b));
break;
default:
System.out.println("invalid");
}
}
}
