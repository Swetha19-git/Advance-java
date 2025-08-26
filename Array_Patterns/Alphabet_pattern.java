import java.util.Scanner;
class Alphabet_pattern{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter a-c");
char c=sc.next().charAt(0);
switch(c){
 case 'a':
    for(int i=1;i<=5;i++){
	 for(int j=1;j<=5;j++){
	   if(i==1||j==1||j==5||i==3){
	    System.out.print("*" );
		}else{
			System.out.print(" ");
		}
	 }
	System.out.println();
   
	}
   break;
   
   case 'b':
    for(int i=1;i<=5;i++){
	 for(int j=1;j<=5;j++){
	   if(i==1||j==1||j==5||i==3||i==5){
	    System.out.print("*");
		}else{
			System.out.print(" ");
		}
	 }
	System.out.println();
   }

   break;
   case 'c':
    for(int i=1;i<=5;i++){
	 for(int j=1;j<=5;j++){
	   if(i==1||j==1||i==5){
	    System.out.print("*" );
		}
		}
	System.out.println();
   }
   break;
   default:
   System.out.print("entern between a-b");
   }
  }
 }
   