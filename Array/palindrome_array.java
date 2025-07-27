import java.util.Scanner;
class palindrome_array{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

int arr[]=new int[4];
System.out.println("enter array elements");
for(int i=0;i<4;i++){
arr[i]=sc.nextInt();
}


for(int i=0;i<arr.length;i++){
int last=0;
int rev=0;
int num=arr[i];
int a=num;
while(num>0){
last=num%10;
rev=rev*10+last;
num=num/10;
}
if(a==rev)
System.out.println(a+ " is palindrome number");
else
System.out.println(a+ " is not palindrome number");
}
}
}