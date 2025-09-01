class Factnumber{
 public  int getFact(int n){
 int fact=1;
  for(int i=1;i<=n;i++)
   fact=fact*i;
   return fact;
  }
  public static void main(String args[]){
   
   Factnumber s=new Factnumber();
   int num=5;
   System.out.println(s.getFact(num));
   }
   }