package cooperation;

public class Bus {
    int bus_num;
    int passengerCnt;
    int money;

    public Bus (int bus_num) {
        this.bus_num = bus_num;
    }
    public void take(int money) {
        this.passengerCnt++;
        this.money += money;
    }
    public void showInfo() {
        System.out.println("버스 "+ bus_num + "번의 승객은 " +
                passengerCnt + "명이고, 수입은 " +
                money + "입니다.");
    }
}
