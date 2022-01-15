package withArrayList;

public class VIPCustomer extends Customer {
    private double saleRatio;
    private int agentID;

    public VIPCustomer(String CustomerName, int CustomerID, int agentID) {
        super(CustomerName, CustomerID);
        CustomerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        //super.setBonusPoint(1000);
        this.agentID = agentID;

        //System.out.println("VIPCustomer() compile");
    }

    public int CalcPoint(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    } //똑같은 이름의 같은 반환값, 같은 매개변수를
    //메소드 오버라이딩(덮어썼다)

    public int getAgentID(int agentID) {
        return agentID;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " 담당 상담원 ID:"
                + agentID;
    }
}
