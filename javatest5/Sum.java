class Sum {
 public int getSum(int arr[]){
  int sum=0;
  for(int i:arr){
  sum=sum+i;
   }
   return sum;
 }
 public static void main(String args[]){
  Sum r=new Sum();
  int arr[]={10,20,30,40};
  System.out.print(r.getSum(arr));
  
  }
  }