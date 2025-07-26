import java.util.*;
class discount{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter purchase product :");
String p=sc.next();
System.out.println("enter purchase quantity :");
int q=sc.nextInt();
System.out.println("enter purchase amount :");
int amount=sc.nextInt();

System.out.println("");
System.out.println("purchase product" + p);
System.out.println("purchase quantity" + q);
System.out.println("purchase amount" + amount);
if(amount<1000)
System.out.println("total amount is "+ amount);
else if(amount>1000)
System.out.println("total amount is "+ (amount-(amount*0.1)));
else
System.out.println("Enter correct amount");

}
}