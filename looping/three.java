import java.util.*;
class a1{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter a:");
int a= sc.nextInt();

System.out.println("enter b:");
int b= sc.nextInt();
System.out.println("enter c:");
int c= sc.nextInt();

if((a>b)&&(a>c)){
System.out.println(" greater is"+a);
}
else if((b>a)&&(b>c)){
System.out.println("greater number is "+b);
}
else{
System.out.println(" greater is"+c);
}
}
}
