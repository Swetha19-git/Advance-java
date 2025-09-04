class Personal{ 
   public void getInformation(String name,long mobile, String address, String email){
   System.out.println("Name of the student "+name);
   System.out.println("Mobile number "+mobile);
   System.out.println("Address "+address);
   System.out.println("Mail id "+email);
   
    }
	}
class Education extends Personal{  

	 public void getInformation(int tamil,int english,int maths,int science, int social){
	 System.out.println("Tamil mark: "+tamil);
	 System.out.println("English mark: "+tamil);
	 System.out.println("Science mark: "+science);
	 System.out.println("Maths mark: "+maths);
	 System.out.println("Social mark: "+social);
	 int total=tamil+english+maths+science+social;
	 System.out.println("Total mark: "+total);
	 double average=total/5;
	 System.out.println("Average mark: "+average);					
	 
	  }
  }
  
  public class Multilevel2{
  public static void main(String args[]){
	   Education obj=new Education();
	   obj.getInformation("Swetha",6475656280L,"Bethaniyapuram","swetha@gmail.com");
	   obj.getInformation(90,80,98,93,92);
   
   }
   }
  