import java.time.LocalDate;

public class Book extends LibraryItem implements Loanable, Reservable {

    // Book constructor inheriting properties from LibraryItem Classs
    public Book(String title, Author author, int numberPages, int yearPublish, double price) {
        super(title, author, numberPages, yearPublish, price);
    }
    // Implementing interfaces from Reservable and Loanable

    @Override
    public boolean isReservable() {
        return true;
    }

    @Override
    public LocalDate reservedDate() {
        return LocalDate.now();
    }

    @Override
    public int reservationLengthInDays() {
        return 14;
    };

    @Override
    public boolean isLoanable() {
        return true;
    }
}