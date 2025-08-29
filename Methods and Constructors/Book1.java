class Book1{ 
 
 
 Book1(){
  System.out.println("Book Details");
  }
 
   
   public void displayBook(String title,String author, int price){
   System.out.println("Title of the Book " +title);
   System.out.println("Author of the Book " +author);
   System.out.println("Book price "+price);
   }
    
	public static void main(String args[]){
	String title="Harry Potter";
	String author="J.K.Rowling";
	int price=250;
	 Book1 b=new Book1();
	 b.displayBook(title,author,price);
	 }
	 }