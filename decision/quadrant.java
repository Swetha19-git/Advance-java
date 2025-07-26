import java.util.*;
class quadrant{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
System.out.println("enter x value:");
int x=sc.nextInt();

System.out.println("enter x value:");
int y=sc.nextInt();
if(x>0 && y>0)
 System.out.println("First quadrant");
else if(x>0 && y<0)
 System.out.println("Second quadrant");
 else if(x<0 && y<0)
 System.out.println("Third quadrant");
 else if(x<0 && y>0)
 System.out.println("Fourth quadrant");
 else
 System.out.println("invalid");
 }
 }