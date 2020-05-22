public class CardHolder {
    private String name;
    private int phoneNumber;
    private boolean hasCard;

    // Constructor
    public CardHolder(String name, int phoneNumber, boolean hasCard) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.hasCard = hasCard;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean hasCard() {
        return hasCard;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setHasCard(boolean hasCard) {
        this.hasCard = hasCard;
    }

}