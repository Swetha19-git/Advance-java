import java.util.*;
class Array1{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int arr[]=new int[size];

for(int i=0;i<size;i++){
System.out.println("Enter value of arr["+i+"]:" );
arr[i]=sc.nextInt();
}

for(int i=0;i<size;i++){
System.out.println(" value of arr["+i+"]:"  +arr[i]);

}

}
}


