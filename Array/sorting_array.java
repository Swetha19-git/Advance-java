import java.util.Scanner;
class sorting_array{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("enter array size:");
int size=sc.nextInt();
int arr[]=new int[size];

System.out.println("Enter array values");
for(int i=0; i<size; i++){
arr[i]=sc.nextInt();
}
System.out.println(" array values before sorted");
for(int i=0; i<size; i++){
System.out.print(arr[i] +",");
}

for(int i=0; i<arr.length; i++){
 for(int j=i+1; j<arr.length; j++){
  if( arr[i]>arr[j]){
    int tem=arr[i];
	arr[i]=arr[j];
	arr[j]=tem;
	}
}
}
System.out.println(" \n");
System.out.println(" array values after sorted");
for(int i:arr){
System.out.print(i+ ",");
}
}
}





