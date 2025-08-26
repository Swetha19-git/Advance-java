import java.util.*;
class Reverse_array{
public static void main(String args[]){

int arr[]={1,2,3,4,5,6};
int num[]=new int[arr.length];
int odd=0;
int eve=0;
for(int i=0;i<arr.length;i++){
	if(arr[i]%2==0)
		eve++;
	else
		odd++;
 
 }
 System.out.println("number of even elements " +eve);
 System.out.println("number of odd elements " +odd);
 

int index=0;
for(int i=arr.length-1;i>=0;i--){
 num[index++]=arr[i];

 }
 for(int i=0;i<num.length;i++){
 System.out.print(num[i] +" ");
 }
 
}
}
 
