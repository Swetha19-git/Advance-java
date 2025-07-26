import java.util.*;
class admin{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter your username");
String username= sc.next();
System.out.println("enter your passwrd");
String password=sc.next();
if(username.equals("Admin")){
if(password.equals("1234")){
System.out.println("login successfull");
}
else{
System.out.println("incorrect password");
}
}
else{
System.out.println("incorrect userame");
}
}
}
