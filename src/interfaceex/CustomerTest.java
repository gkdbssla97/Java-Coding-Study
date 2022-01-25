package interfaceex;

public class CustomerTest {
    public static void main(String[] args) {
        Customer cus = new Customer();
        Buy buyer = cus; // Buy를 implements
        buyer.buy();

        Sell seller = cus;
        seller.sell();
        buyer.order();
        cus.order();
    }
}
