package Inheritance;

public class OverridingTest {
    public static void main(String[] args) {
        /*Customer cus0 = new Customer("LEE", 10002);
        cus0.CalcPoint(10000);
        int price = cus0.CalcPoint(10000);
        System.out.println("가격은"+price+cus0.showCustomerInfo());

        VIPCustomer cus1 = new VIPCustomer("HA", 100012, 100);
        cus1.CalcPoint(10000);
        price = cus1.CalcPoint(10000);
        System.out.println("가격은 "+price+cus1.showCustomerInfo());*/

        Customer cus2 = new VIPCustomer("VI", 10014, 101);
        int price = cus2.CalcPoint(10000);
        System.out.println("가격은 "+price+cus2.showCustomerInfo());

        Customer customerGold = new GoldCustomer();
        /*타입이 Customer 인스턴스가 Gold일 경우 재정의된 메소드(오버라이딩)은
        Gold가 불리고 재정의되지 않은 메소드는 Customer이 불린다.*/
        price = customerGold.CalcPoint(10000);
        System.out.println("가격은 "+price+customerGold.showCustomerInfo());
    }
}
