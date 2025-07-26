import java.util.*;
class main{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
System.out.println("enter number of classes held :");
int c=sc.nextInt();

System.out.println("enter number of classes attended :");
int attend=sc.nextInt();
 double percentage= c*75/100;
  //System.out.println("your percentage" +percentage);
 if (attend>percentage)
 System.out.println("you are allowed to attend exam");
 else
  System.out.println("you are not allowed to attend exam");
}
}

