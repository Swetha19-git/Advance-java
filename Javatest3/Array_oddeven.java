import java.util.*;
class Array_oddeven{
 public static void main(String args[]){
 int arr[]={2,3,5,6,8,9,4,10};
 int odd=0;
 int even=0;
 for(int i=0;i<arr.length;i++){
  int num=arr[i];
  if(num%2==0){
  even++;
  }
  else{
  odd++;
  }
  }
  System.out.println("no of even numbers in the array:" +even);
  System.out.println("no of odd numbers in the array:" +odd);
  }
  }