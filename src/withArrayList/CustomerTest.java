package withArrayList;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> CusList = new ArrayList<Customer>();
        // Customer, Gold, VIP 모두 Customer로 변환가능

        Customer A = new Customer("A", 1001);
        Customer B = new Customer("B", 1002);
        GoldCustomer C = new GoldCustomer("C", 1003);
        GoldCustomer D = new GoldCustomer("D", 1004);
        VIPCustomer E = new VIPCustomer("E", 1005, 101);
        VIPCustomer F = new VIPCustomer("F", 1006, 100);

        CusList.add(A);
        CusList.add(B);
        CusList.add(C);
        CusList.add(D);
        CusList.add(E);
        CusList.add(F);

        System.out.println("=====출력=====");
        for(Customer s: CusList)
            System.out.println(s.showCustomerInfo());
        System.out.println("=====할인율과 보너스 포인트 결과=====");
        int price = 10000;
        for(Customer s: CusList) {
            int cost = s.CalcPoint(price);

            System.out.println(s.getCustomerName()+"님이"+cost+"를 지불하였습니다");
            System.out.println(s.showCustomerInfo());
        }
    }
}
