class Secondmax{
 public  int getArray(int arr[]){
  int max=0;
  int smax=-1;
  for(int i:arr){
   if(i>max){
   smax=max;
    max=i;
	}
	else if(i<max && i>smax){
	 smax=i;
	 }
	 }
	 return smax;
	
  }
  public static void main(String args[]){
   
    Secondmax s=new Secondmax();
   int arr[]={1,3,15,5,16};
   System.out.println("Second maximum element is" +s.getArray(arr));
   }
   }