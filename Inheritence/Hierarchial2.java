import java.util.Scanner;
class School{ 
   public void getInformation(String name,long mobile, String address, String email){
   System.out.println("Name of the School "+name);
   System.out.println("Mobile number "+mobile);
   System.out.println("Address "+address);
   System.out.println("Mail id "+email);
   
    }
	}
class Student extends School{
 public void studentInformation(String name,long mobile, String address, String email,String dept){
 System.out.println("Name of the student "+name);
   System.out.println("Mobile number "+mobile);
   System.out.println("Address "+address);
   System.out.println("Mail id "+email);
 System.out.println("Department: "+dept);
 
  }
  }
  class Staff extends School{
  public void staffInformation(String name,long mobile, String address, String email,String dept){
 System.out.println("Name of the staff "+name);
   System.out.println("Mobile number "+mobile);
   System.out.println("Address "+address);
   System.out.println("Mail id "+email);
 System.out.println("Department: "+dept);
	 }
  }
  public class Hierarchial2{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  Student obj1=new Student();
   Staff obj=new Staff();
  System.out.println("Staff or Student detail");
  String a=sc.next();
  if(a.equals("Staff")){
  
   System.out.println("School information");
   obj.getInformation("Leuca",989607890L,"TVS Nagar","leuca@gmail.com");
   System.out.println("Staff information");
   obj.staffInformation("Sheela",34567890L,"Bethaniyapuram","sheela@gmail.com","IT");
    }
	else
	
	 System.out.println("School information");
   obj1.getInformation("Leuca",989607890L,"TVS Nagar","leuca@gmail.com");
    System.out.println("Student information");
   obj1.studentInformation("Swetha",989607890L,"Kalavasal","swetha@gmail.com","CSE");
   
   }
   }