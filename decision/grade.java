import java.util.*;
class grade{
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
int total=tamil+eng+maths;
int percentage=total/3;

System.out.println(" name: "+name);
System.out.println(" rollnumber :"+roll);
System.out.println();
System.out.println(" Tamil mark: "+tamil);
System.out.println(" english mark:"+eng);
System.out.println(" maths mark:"+maths);
System.out.println(" Percentage:"+percentage);

if(percentage>=90)
System.out.println("Grade is : excellent");
else if(percentage>75 && percentage<90)
System.out.println("Grade is : very good");
else if(percentage>60 && percentage<=75)
System.out.println("Grade is : good");
else if(percentage>35 && percentage<=50)
System.out.println("Grade is : Average");
else if(percentage>=0 && percentage<=35)
System.out.println("Grade is : Fail");
else
System.out.print("enter correct marks");
}
}