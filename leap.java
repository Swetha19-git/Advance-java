import java.util.*;
class a1{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter year:");
int year= sc.nextInt();

if(year%4==0){
System.out.println(year + "is leap number");
}
else{
System.out.println(year + "is not leap number");
}
}
}