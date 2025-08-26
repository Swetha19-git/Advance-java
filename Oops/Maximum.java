class Maximum{
  public void findMax(){
    int arr[]={3,4,5,6,7};
	int max=0;
	for(int i: arr){
	 if(i>max){
	  max=i;
	  }
	  }
	  System.out.print("maximum number in array is " +max);
  }
  public static void main(String args[]){
   Maximum m= new Maximum();
    m.findMax();
	}
}