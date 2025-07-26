import java.util.*;
class job{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter your aptitude mark:");
int apti=sc.nextInt();
System.out.println("enter your GD mark:");
int gd=sc.nextInt();
System.out.println("enter technical score:");
int tech=sc.nextInt();
System.out.println("enter HR interview score:");
int hr=sc.nextInt();

if(apti>=85)

 if(gd>=90)
 
  if(tech>=80)
  
   if(hr>=95)
   
    System.out.println("congrats you passed in all");
   
   else
   System.out.println("you are not selected in hr round");
   
  else
  System.out.println("you failed in technical round");
  
 else
 System.out.println("you failed in gd ");
 

else
System.out.println("you failed in aptitude");


}
}
