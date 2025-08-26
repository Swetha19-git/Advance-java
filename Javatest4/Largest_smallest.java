import java.util.*;
class Largest_smallest{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int arr[]=new int[7];
 for(int k=0;k<arr.length;k++){
  arr[k]=sc.nextInt();
 }
 
 for(int i=0;i<arr.length;i++){
  for(int j=i+1;j<arr.length;j++){
   if(arr[i]>arr[j]){
    int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	}
	}
  }
  
   for(int k=0;k<arr.length;k++){
  System.out.print(arr[k]+" ");
 }
 System.out.print("largest element in the array:" +arr[arr.length-1]);
 System.out.print("Smallest element in the array:" +arr[0]);
 
  }
}