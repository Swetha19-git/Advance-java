import java.util.Scanner;
class niven{
public static void main (String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number:");
int num=sc.nextInt();
int a=num;
int last=0;
int sum=0;

while(num>0){
last=num%10;
sum=sum+last;
num=num/10;
}

if(a%sum==0)
System.out.println(a +" is niven number");
else
System.out.println(a +" is not niven number");
}
}




