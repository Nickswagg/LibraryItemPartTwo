public class Author {
    private String authorName;
    public PublishingCompany publisher;

    // Constructor
    public Author(String authorName, PublishingCompany publisher) {
        this.authorName = authorName;
        this.publisher = publisher;
    }

    // Getters
    public String getAuthorName() {
        return authorName;
    }

    public PublishingCompany PublishingCompany() {
        return publisher;
    }

    // Setters
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPublishingCompany(PublishingCompany publisher) {
        this.publisher = publisher;
    }
}