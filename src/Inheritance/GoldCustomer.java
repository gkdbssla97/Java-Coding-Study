package Inheritance;

public class GoldCustomer extends Customer{
    public GoldCustomer() {
        bonusRatio = 0.05;
        CustomerGrade = "Gold";
    }
    @Override
    public int CalcPoint(int price) {
        return super.CalcPoint(price);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}
