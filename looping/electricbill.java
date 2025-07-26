import java.util.*;
class electricbill{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter your name:");
String name= sc.next();
System.out.println("enter your address:");
String y= sc.next();
System.out.println("enter unit:");
double unit= sc.nextDouble();
double billamount=0.0;
if(unit>0 && unit<=100){
System.out.print("your electric bill is free");
 }
 else if(unit>=200 && unit<=500){
billamount= unit * 5;
 }
else if(unit>500 && unit<=1000){
billamount= unit * 7.25;
 }
 else if(unit>1000 ){
System.out.print("please conduct electric board");
 }
 else{
 System.out.println ("please enter correct unit");
 }
 
 System.out.println("Hi"+ name);
 System.out.println("your address is"+ y);
 System.out.println("your entered unit is"+ unit);
 System.out.println("your total bill amount is"+ billamount );
 
 
 }
}
 
