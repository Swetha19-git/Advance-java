import java.util.*;
class semester{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter year");
int year= sc.nextInt();
System.out.println("enter semester");
int sem= sc.nextInt();
switch(year)
{
case 1:
  if(sem==1){
  System.out.println("1.oops/n2.ds");
  }
  else if(sem==2){
  System.out.println("1.maths/n2.cs");
  }
  else{
  System.out.println("invalid");
  }
 break;

case 2:
   switch(sem)
   {
   case 3:
    System.out.println("1.oops\n2.ds");
	break;
	case 4:
    System.out.println("1.cn\n 2.maths");
	break;
	default:
    System.out.println("invalid");
	}
	break;
default:
System.out.println("enter valid");
}
}
}