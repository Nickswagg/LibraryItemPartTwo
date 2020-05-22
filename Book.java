public class Book extends LibraryItem {

    // Book constructor inheriting properties from LibraryItem Classs
    public Book(String title, Author author, int numberPages, int yearPublish, double price) {
        super(title, author, numberPages, yearPublish, price);
    }
}