import java.util.*;
class dollar{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter rupees(dollar):");
int dollar=sc.nextInt();
double rupee= dollar * 0.012;
System.out.println("Enterd amount(in dollar)" + dollar);
System.out.println("Amount (in rupees)" +rupee);
}
}