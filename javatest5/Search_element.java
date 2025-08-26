import java.util.*;
class Search_element{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the search element");
  int arr[]={2,3,4,5,6};
   int key=sc.nextInt();
   boolean flag=true;
  System.out.println("The array elements are");
  for(int i:arr){
   System.out.print(i+" ");
   }
   System.out.print(" \n");
    for(int j:arr){
	if(j==key){
	  System.out.println("The element is found ");
	  flag=false;
	  break;
	}
   
   }
   if(flag==true){
	  System.out.println("The element is not found ");
	  }
   
   
   
  }
 }