import java.util.*;
class fizz{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int n=sc.nextInt();
if(n%3==0 && n%5==0 )
System.out.println(n+" is fizzbuzz number");
else if(n%5==0)
System.out.println(n+" is buzz number");
else if(n%3==0)
System.out.println(n+" is fizz ");
else
System.out.println(n+" is not fizz and buzz number");
}
}