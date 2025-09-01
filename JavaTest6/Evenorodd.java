class Evenorodd{
 public  int getNumber(int n){
 if(n%2==0)
  return 1;
  else
  return 0;
  }
  public static void main(String args[]){
   
   Evenorodd s=new Evenorodd();
   int num=10;
   System.out.println(num);
   if(s.getNumber(num)==1)
   System.out.println("even");
else
	System.out.println("odd");
   }
   }