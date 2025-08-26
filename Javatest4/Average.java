import java.util.*;
class Average{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int arr[]={1,2,3,4,5,6};
int sum=0;
for(int i=0;i<arr.length;i++){
 sum=sum+arr[i];
 }
 int average=sum/arr.length;
 System.out.println("sum of the array element is " +sum);
 System.out.println("average is " +average);
 }
 }
