import java.util.*;
class a2{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
System.out.println("enter a value:");
int a=sc.nextInt();
System.out.println("enter l value:");
int l=sc.nextInt();
System.out.println("enter b value:");
int b=sc.nextInt();
System.out.println("enter h value:");
int h=sc.nextInt();
System.out.println("enter b1 value:");
int b1=sc.nextInt();
System.out.println("enter b2 value:");
int b2=sc.nextInt();
System.out.println("enter r value:");
double r=sc.nextDouble();
System.out.println();
System.out.println("Area of square");
System.out.println("entered a value is:" +a);
int squarearea=a*a;
System.out.println("area of square :" +squarearea);
System.out.println();
System.out.println("Area of Rectangle");
System.out.println("entered l value is:" +l );
System.out.println("entered b value is:" +b);
int rectanglearea=l*b;
System.out.println("area of rectangle :" +rectanglearea);
System.out.println();
System.out.println("Area of Triangle");
System.out.println("entered b value is:" +b);
System.out.println("entered h value is:" +h);
int Trianglearea=b*h*1/2;
System.out.println("area of Triangle :" +Trianglearea);
System.out.println();
System.out.println("Area of Trapezoid");
System.out.println("enterd b1 value is:" +b1);
System.out.println("enterd b2 value is:" +b2);
System.out.println("enterd h value is:" +h);
int trapezoidarea=((b1+b2)*h)/2;
System.out.println("area of Trapezoid :" +trapezoidarea);
System.out.println();
System.out.println("Area of Circle");
System.out.println("entered r value is:" +r);
double circlearea= 22.7*r*r;
System.out.println("area of Circle :" +circlearea);
}
}



