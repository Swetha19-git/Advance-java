import java.util.*;
class Palindrome{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter number");
  int num=sc.nextInt();
  int num2=num;
  int last=0;
  int rev=0;

  while(num>0){
  last=num%10;
  rev=rev*10+last;
  num=num/10;
  }
  if(rev==num2)
  System.out.println("It is palindrome");
  else
  System.out.println("It is not palindrome");
  }
  
}

  
  
 
