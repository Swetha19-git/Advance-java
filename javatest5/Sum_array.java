import java.util.*;
class Sum_array{
 public static void main(String args[]){
  int arr[]={2,3,4,5,6};
  int sum=0;
  System.out.println("The array elements are");
  for(int i:arr){
   System.out.println(i);
   }
    for(int j:arr){
   sum=sum+j;
   }
   System.out.println("The sum of elements are "+sum);
   
   
  }
 }