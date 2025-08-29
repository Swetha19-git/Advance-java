import java.util.Scanner;
class calculator{
 
 public void add(){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a and b");
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=a+b;
  System.out.println("addition of a and b is " +c);
  }
  public static void main(String args[]){
   calculator c=new calculator();
   c.add();
   }
   }