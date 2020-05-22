import java.time.LocalDateTime;
import java.util.List;

public class Magazine extends Periodical {

    private LocalDateTime datePublished;

    public Magazine(String title, Author author, int numberPages, int yearPublish, double price,
            LocalDateTime datePublished) {
        super(title, author, numberPages, yearPublish, price);

        this.datePublished = datePublished;
    }

    public static void printPeriod(List<Magazine> Mags, LocalDateTime date) {
        // Cycle through the list of Magzines
        for (Magazine m : Mags) {
            // Prints out the list of Magazines and their published date
            System.out.println(m.toString() + " was published on" + date);

        }
    }

}