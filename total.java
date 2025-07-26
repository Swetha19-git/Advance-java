import java.util.*;
class a1{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter your name:");
  String name= sc.next();
   System.out.println("enter your register number:");
  int register= sc.nextInt();
  System.out.println("enter tamil mark:");
  int tamil= sc.nextInt();
  System.out.println("enter english mark:");
  int english= sc.nextInt();
  System.out.println("enter maths mark:");
  int maths= sc.nextInt();
  System.out.println("enter science mark:");
  int science= sc.nextInt();
  System.out.println("enter social mark:");
  int social= sc.nextInt();
  System.out.println("Name:" +name);
  System.out.println("Register number: " +register);
  System.out.println("Tamil mark: " +tamil);
  System.out.println("English mark: " +english);
  System.out.println("Maths mark: " +maths);
  System.out.println("Science mark: " +science);
  System.out.println("Social mark: " +social);
  int total= tamil+english+maths+science+social;
  System.out.println("your total is: "+total);
  int average= total/5;
  System.out.println("averageis: " +average);
  }
}
