import java.util.*;
class perfect{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	for(int x=1;x<=100;x++){
	int num=x;
	int sum=0;
	for(int i=1;i<num;i++){
			if(num%i==0){
				//System.out.print(i+"+");
				sum=sum+i;
			}
		}
		
		if(num==sum){
			System.out.print(num+",");
		}
	}
	}
}
