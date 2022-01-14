package Inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
        /*Customer cus1 = new Customer();
        cus1.setCustomerID(10100);
        cus1.setCustomerName("LEE");*/

        VIPCustomer cus2 = new VIPCustomer(10101, "Kim");

        cus2.bonusPoint = 1000;
        //System.out.println(cus1.showCustomerInfo());
        System.out.println(cus2.showCustomerInfo());
    }
}
