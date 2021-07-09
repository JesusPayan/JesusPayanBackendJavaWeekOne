public class Paypal extends Payment {
    String emailAccount;

    public Paypal(Integer id, String emailAccount) {
        super(id);
        this.emailAccount = emailAccount;
    }
}
