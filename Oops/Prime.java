class Prime{
  public void checkPrime(){
    int arr[]={3,4,5,6,7};
	for(int j:arr){
	 int num=j;
	int count=0;
	for(int i=2;i<num;i++){
	  if(num%i ==0){
	    count++;
	}
	
	 }
	 if(count==0)
	  System.out.println(num + " is  prime number");
	else
	 System.out.println(num + " is not prime number");
   }
  }   
	  
  public static void main(String args[]){
   Prime m= new Prime();
    m.checkPrime();
	}
}