package withArrayList;

public class GoldCustomer extends Customer {
    double saleRatio;

    public GoldCustomer(String CustomerName, int CustomerID) {
        super(CustomerName, CustomerID);
        CustomerGrade = "Gold";
        bonusRatio = 0.02;
        saleRatio = 0.1;

        System.out.println("GoldCustomer() compile");
    }

    @Override // Annotation
    // 어노테이션은 코드 사이에 주석처럼 쓰여서 특별한 의미, 기능을 수행하도록 하는 기술이다.
    public int CalcPoint(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price *saleRatio);
    }
}
