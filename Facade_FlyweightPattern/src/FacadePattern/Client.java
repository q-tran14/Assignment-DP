package FacadePattern;

public class Client {
    public static void main(String[] args) {
        Facade.getInstance().buyByCashWithFreeShip("520H0569",
                "tranquangquan.it@gmail.com");

        Facade.getInstance().buyByPaypalWithStandardShip("520H0569",
                "tranquangquan.it@gmail.com",
                "0770519652");
    }
}






