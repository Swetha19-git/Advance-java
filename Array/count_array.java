import java.util.Scanner;
class count_array{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

int arr[]=new int[10];
System.out.println("enter array elements");
for(int i=0;i<10;i++){
arr[i]=sc.nextInt();
}
int positive=0;
int negative=0;
int zero=0;
for(int i=0;i<10;i++){
 int num=arr[i];
 if(num>0)
 positive++;
 else if(num<0)
 negative++;
 else
 zero++;
}
System.out.println("number of positive numbers " +positive);
System.out.println("number of negative numbers "+negative);
System.out.println("number of zeros " +zero);
}
}