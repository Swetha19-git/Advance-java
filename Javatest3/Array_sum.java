import java.util.*;
class Array_sum{
 public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
 System.out.println("enter numbers");
 int arr[]=new int[5];
 for(int i=0;i<5;i++){
  arr[i]=sc.nextInt();
 }
 
 int sum=0;
 for(int i=0;i<arr.length;i++){
 sum+=arr[i];
 }
 float average= sum/5;
 System.out.println("sum of array is" +sum);
 System.out.println("Average of array is" +average);
 }
 }