import java.util.*;
class tenth{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
System.out.println("Enter your name: ");
String name=sc.next();
System.out.println("Enter your roll number: ");
int roll=sc.nextInt();
System.out.println("Enter your marks: ");
System.out.println("Tamil mark:");
int tamil=sc.nextInt();
System.out.println("English mark:");
int eng=sc.nextInt();
System.out.println("Maths mark:");
int maths=sc.nextInt();
System.out.println("Science mark:");
int science=sc.nextInt();
System.out.println("Social mark:");
int social=sc.nextInt();
int total= tamil+eng+maths+science+social;
int average=total/5;
System.out.println();

System.out.println(" name: "+name);
System.out.println(" rollnumber :"+roll);
System.out.println();
System.out.println(" Tamil mark: "+tamil);
System.out.println(" english mark:"+eng);
System.out.println(" maths mark:"+maths);
System.out.println(" Science mark:"+science);
System.out.println(" Social mark:" +social);
System.out.println(" your total mark: " +total);
System.out.println(" your Average : " +average);
}
}

