class sample{ 
 public void max(){
  System.out.print("hi");
  }
  public void min(){
   sample.max();
   
 }
 public static void main(){
  sample s=new sample();
  s.min();
  }
  }