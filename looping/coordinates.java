import java.util.*;
class coordinates{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter x value:");
int x= sc.nextInt();
System.out.println("enter y value:");
int y= sc.nextInt();
if(x>0 && y>0){
 System.out.println ( "First quadrant");
 }
 else if(x<0 && y>0){
 System.out.println ("second quadrant");
 }
 else if(x<0 && y<0){
 System.out.println ("third quadrant");
 }
 else{
 System.out.println ("Fourth quadrant");
 }
 }
}
 
