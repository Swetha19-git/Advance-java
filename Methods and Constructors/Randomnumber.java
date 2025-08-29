import java.util.Scanner;
class Randomnumber{
 public int getRandom(){
  System.out.println("enter number between 1-100");
  Scanner sc=new Scanner(System.in);
  int num=sc.nextInt();
  return num;
  }
  public static void main(String args[]){
   Randomnumber r=new Randomnumber();
   System.out.println("entered number is "+(r.getRandom()));
   }
   }
  