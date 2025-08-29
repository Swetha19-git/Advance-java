class Book{
    String title;
 String author;
 int price;
 
 Book(){
  System.out.println("Book Details");
  }
  
  Book(String title,String author, int price){
   this.title=title;
   this.author=author;
   this. price=price;
   }
   
   public void displayBook(){
   System.out.println("Title of the Book " +title);
   System.out.println("Author of the Book " +author);
   System.out.println("Book price "+price);
   }
    
	public static void main(String args[]){
	String title="Harry Potter";
	String author="J.K.Rowling";
	int price=250;
	 Book b=new Book(title,author,price);
	 b.displayBook();
	 }
	 }