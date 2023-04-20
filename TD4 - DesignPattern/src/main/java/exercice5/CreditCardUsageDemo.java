package exercice5;

public class CreditCardUsageDemo {

    public static void main(String[] args) {
        ICreditCard cc = new CreditCardAdapter("ING Bank", "John Doe", 123321);
        CreditCardUser ccu = new CreditCardUser(cc);
        ccu.displayMyCreditCardDetails();
    }
}
