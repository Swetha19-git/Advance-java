import java.util.*;
class Array_prime{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int arr[]=new int[size];

for(int i=0;i<size;i++){
System.out.println("Enter value of arr["+i+"]:" );
arr[i]=sc.nextInt();
}

for(int i=0;i<size;i++){
  int num= arr[i];
  int count=0;
  for(int j=2;j<num;j++){
    if(num%j==0){
	count++;
	break;
	}
	}
	if(count==0)
	System.out.println(num+ " is prime number");
	else
	System.out.println(num+ " is not prime number");
	

}
}
}
