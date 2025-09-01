class SumEven{
 public  int getArray(int arr[]){
  int sum=0;
 for(int i:arr){ 
  if(i%2==0)
   sum=sum+i;
	
  }
  return sum;
  }
  public static void main(String args[]){
   
    SumEven s=new SumEven();
   int arr[]={1,2,14,5,16};
   System.out.println("Sum of the  element is" +s.getArray(arr));
   }
   }