package exercice5;

public class CreditCardAdapter implements ICreditCard{
    private BankDetails bd = new BankDetails();
    public CreditCardAdapter(String bn,String an, long anu){
        bd.setBankName(bn);
        bd.setAccountHolderName(an);
        bd.setAccountNumber(anu);
    }
    @Override
    public String getCreditCardDetails() {
        return bd.getBankName()+" - Mr. and Ms. "+bd.getAccountHolderName()+" - "+bd.getAccountNumber();
    }
}
