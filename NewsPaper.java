import java.time.LocalDateTime;
import java.util.List;

public class NewsPaper extends Periodical {

    private LocalDateTime daily;

    public NewsPaper(String title, Author author, int numberPages, int yearPublish, double price, LocalDateTime daily) {
        super(title, author, numberPages, yearPublish, price);

        this.daily = daily;
    }

    public static void printDaily(List<NewsPaper> News, LocalDateTime dailyPub) {
        // Cycle through the list of Newspapers
        for (NewsPaper n : News) {
            // Prints out the list of Newspapers and their published date
            System.out.println(n.toString() + " was published on" + dailyPub);

        }
    }

}