package FacadePattern;

public class PayService {
    public void Paypal()
    {
        System.out.println("Pay by Paypal");
    }
    public void CreditCard()
    {
        System.out.println("Pay by Credit Card");
    }
    public void EBankingAccount()
    {
        System.out.println("Pay by E-banking account");
    }
    public void Cash()
    {
        System.out.println("Pay by cash");
    }
}
