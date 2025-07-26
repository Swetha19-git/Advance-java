import java.util.*;
class buzz{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter number");
int num=sc.nextInt();
for(int i=1;i<=num;i++){
if(i%7==0 && i%10==0){
System.out.println(i+" is buz number");
}
}
}
}