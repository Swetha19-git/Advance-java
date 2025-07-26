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
  System.out.println("enter physics mark:");
  int physics= sc.nextInt();
  System.out.println("enter chemistry mark:");
  int chemistry= sc.nextInt();
   System.out.println("enter Biology mark:");
  int biology= sc.nextInt();
  System.out.println("Name:" +name);
  System.out.println("Register number: " +register);
  System.out.println("Tamil mark: " +tamil);
  System.out.println("English mark: " +english);
  System.out.println("Maths mark: " +maths);
  System.out.println("physics mark: " +physics);
  System.out.println("chemistry mark: " +chemistry);
  System.out.println("biology mark: " +biology);
  int engineeringcuttoff = chemistry/2+physics/2+maths;
  int biologycuttoff= chemistry/2+physics/2+biology;
  int total= tamil+english+maths+physics+chemistry+biology;
  System.out.println("your total is: "+total);
  int average= total/5;
  System.out.println("averageis: " +average);
  System.out.println("Engineering cutoff:" +engineeringcuttoff);
  System.out.println("Medical cutoff:" +biologycuttoff);
  }
}
