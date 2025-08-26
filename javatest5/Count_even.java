import java.util.*;
class Count_even{
 public static void main(String args[]){
  int arr[]={2,3,4,5,6};
   int count=0;
  System.out.println("The array elements are");
  for(int i:arr){
   System.out.print(i+" ");
   }
    for(int j:arr){
	if(j%2==0){
	  count++;
	  }
   
   }
   System.out.println("The number of even number in the array is "+count);
   
   
  }
 }
