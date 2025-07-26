import java.util.*;
class a1{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter your name:");
String name= sc.next();

System.out.println("enter your age:");
int age= sc.nextInt();

if(age>25){
System.out.println("Account successfully created" +name);
}
else{
System.out.println(name+ "you are child to create account ");
}
}
}
