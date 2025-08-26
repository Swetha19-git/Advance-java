class Sum{
  public void sumOfDigits(){
    int num=123;
	int last=0;
	int sum=0;
	while(num>0){
	 last=num%10;
	 sum=sum+last;
	 num=num/10;
	}
	System.out.print("sum of number is " +sum);	 
	
  }
  public static void main(String args[]){
   Sum m= new Sum();
    m.sumOfDigits();
	}
}