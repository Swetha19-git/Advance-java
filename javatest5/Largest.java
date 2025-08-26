class Largest {
 public int getMax(int arr[]){
  int max=0;
  for(int i:arr){
   if(i>max)
   max=i;
   }
   return max;
 }
 public static void main(String args[]){
  Largest r=new Largest();
  int arr[]={10,60,30,40,20};
  System.out.print(r.getMax(arr));
  
  }
  }