public class Book {
    private String title;
    private String author;
    private int year;

    
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.year = 0;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.year = 0; 
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
       
        Book book1 = new Book(); 
		
	
        Book book2 = new Book("The Great Gayathri", "Software Developer"); 
        Book book3 = new Book("Mathematics", "guide", 2023); 

        System.out.println("Book 1: Title - " + book1.getTitle() + ", Author - " + book1.getAuthor() + ", Year - " + book1.getYear());
        System.out.println("Book 2: Title - " + book2.getTitle() + ", Author - " + book2.getAuthor() + ", Year - " + book2.getYear());
        System.out.println("Book 3: Title - " + book3.getTitle() + ", Author - " + book3.getAuthor() + ", Year - " + book3.getYear());
    }
}
