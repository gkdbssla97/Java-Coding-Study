package cooperation;

public class Subway {
    int line_num;
    int passengerCnt;
    int money;

    public Subway (int line_num) {
        this.line_num = line_num;
    }
    public void take(int money) {
        this.passengerCnt++;
        this.money += money;
    }
    public void showInfo() {
        System.out.println("전철 "+ line_num + "번의 승객은 " +
                passengerCnt + "명이고, 수입은 " +
                money + "입니다.");
    }
}
