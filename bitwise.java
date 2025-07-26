import java.util.*;
class a1{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter a value:");
int a=sc.nextInt();

System.out.println("right shift:" +(a>>2));
System.out.println("left shift:" +(a<<2));
}
}