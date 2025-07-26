import java.util.*;
class grade{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter your name:");
String name= sc.next();
System.out.println("enter your Tamil mark:");
int tamil= sc.nextInt();
System.out.println("enter your English mark:");
int english= sc.nextInt();
System.out.println("enter your Maths mark:");
int maths= sc.nextInt();
System.out.println("enter your Science mark:");
int science= sc.nextInt();
System.out.println("enter your Social mark:");
int social= sc.nextInt();
int total= tamil+english+maths+science+social;
System.out.println("your total is " +total);
if(total>=400 && total<=500){
System.out.print(name+ "is A grade");
 }
 else if(total>=350 && total<400){
System.out.print(name+ "is B grade");
 }
 else if(total>=300 && total<350){
System.out.print(name+ "is C grade");
 }
 else if(total>=250 && total<300){
System.out.print(name+ "is D grade");
 }
 else if(total>=0 && total<250){
System.out.print(name+ "is F grade");
 }
 else{
System.out.print("enter correct mark ");
 }
}
}