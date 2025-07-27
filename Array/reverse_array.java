import java.util.Scanner;
class reverse_array{
public static void main(String args[]){
int arr[]={1,2,3,4};
System.out.println("original array is: ");
for(int i=0;i<arr.length;i++)
{
System.out.print( arr[i] );
}
System.out.print( "\n" );
System.out.println("reverse array is: ");
for(int i=arr.length-1; i>=0; i--){
System.out.print( arr[i] );
}
}
}

