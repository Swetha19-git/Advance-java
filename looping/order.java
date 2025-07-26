import java.util.*;
class order{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int a=sc.nextInt();
System.out.println("enter number");
int b=sc.nextInt();

if(a>b){
for(int i=a;i>=b;i--){
System.out.println(i);
}
}
else if(a<b){
for(int i=a;i<b;i++){
System.out.println(i);
}
}
else{
System.out.println("invalid");
}
}
}
