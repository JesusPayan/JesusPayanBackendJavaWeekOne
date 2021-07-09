public class Card extends Payment {
    Integer cardNumber;
    Short cvv;
    String dateExpired;

    public Card(Integer id, Integer cardNumber, Short cvv, String dateExpired) {
        super(id);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateExpired = dateExpired;

    }
}
