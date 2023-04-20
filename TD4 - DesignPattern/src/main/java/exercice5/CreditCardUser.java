package exercice5;

public class CreditCardUser {
    private ICreditCard creditCard;

    public CreditCardUser(ICreditCard cc){
        this.creditCard = cc;
    }
    public void displayMyCreditCardDetails(){
        System.out.println(this.creditCard.getCreditCardDetails());
    }
}
