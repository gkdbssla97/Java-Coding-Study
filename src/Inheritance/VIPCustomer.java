package Inheritance;

public class VIPCustomer extends Customer {

    private double saleRatio;
    private int agentID;

    public VIPCustomer (int customerID, String CustomerName) {
        super(customerID, CustomerName); //상위클래스 호출
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        super.setBonusPoint(1000);

        System.out.println("VIPCustomer(int, String) 호출");
    }
    public int getAgentID() {
        return agentID;
    }
}
/* 가시성이 제일 작은건 private, package 안에서만 접근가능한
것은 default, package가 달라도 상/하위 끼리 볼 수 있는 것은
protected, 모두 접근할 수 있는 접근제어자는 public.
 */