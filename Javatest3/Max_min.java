import java.util.*;
class Max_min{
 public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
 System.out.println("enter numbers");
 int arr[]=new int[5];
 for(int i=0;i<5;i++){
  arr[i]=sc.nextInt();
 }
 Arrays.sort(arr);
 System.out.println("maximum number in the array" +arr[arr.length-1]);
 System.out.println("minimum number in the array" +arr[0]);
 }
}
 
 