package FacadePattern;

public class Facade {
    private static Facade instance;

    private AccService acc;
    private PayService pay;
    private ShipService ship;
    private MailService mail;
    private SMSService sms;

    private Facade()
    {
        acc = new AccService();
        pay = new PayService();
        ship = new ShipService();
        mail = new MailService();
        sms = new SMSService();
    }

    public static Facade getInstance()
    {
        if (instance == null)
            instance = new Facade();
        return instance;
    }

    public void buyByCashWithFreeShip(String id, String email)
    {
        acc.getAcc(id);
        pay.Cash();
        ship.Free();
        mail.sendMail(email);
        System.out.println("Done\n");
    }

    public void buyByPaypalWithStandardShip(String id, String email, String mobilePhone)
    {
        acc.getAcc(id);
        pay.Paypal();
        ship.Standard();
        mail.sendMail(email);
        sms.sendSMS(mobilePhone);
        System.out.println("Done\n");
    }
}
