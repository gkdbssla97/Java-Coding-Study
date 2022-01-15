package withArrayList;

public class Customer {
    protected int CustomerID;
    protected String CustomerName;
    protected String CustomerGrade;
    int bonusPoint;
    protected double bonusRatio;

    public Customer() {
        CustomerGrade = "SILVER";
        bonusRatio = 0.01;

        //System.out.println("Customer() compile");
    }
    public Customer(String CustomerName, int CustomerID) {
        this.CustomerName = CustomerName;
        this.CustomerID = CustomerID;
        CustomerGrade = "SILVER";
        bonusRatio = 0.01;

        //System.out.println("Customer(Name, ID) compile");
    }

    public int CalcPoint(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }
    public String showCustomerInfo() {
        return (CustomerName+"님의 등급은 "+CustomerGrade+
                "이고 보너스 포인트는 "+bonusPoint+" 입니다");
    }
    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerGrade() {
        return CustomerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        CustomerGrade = customerGrade;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }
}
