package Apple;

public class Transaction {
    public static void main(String[] args) {
        Buyer AI = new Buyer("Hay", 100000);

        IPhone I = new IPhone("13");
        Mac M = new Mac("M1");

        AI.BuyIphone(I);
        AI.BuyMac(M);

        AI.showInfo();
        I.showInfo();
        M.showInfo();
    }
}
