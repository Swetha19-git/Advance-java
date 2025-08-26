import java.util.*;
class Search_element{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
 int arr[]={5,6,7,3,2,1};
 System.out.println("enter search number");
 int num=sc.nextInt();
 boolean flag=true;
 for(int i=0;i<arr.length;i++){
   int n=arr[i];
   if(num==arr[i]){
     System.out.print("index of the search element is "+i);
	 flag=false;
	 break;
	 }
	 
	}
	if(flag==true)
		System.out.println("Not found");
}
}