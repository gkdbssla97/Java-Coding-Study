package Apple;

public class Buyer {
    int age, money;
    String Name;

    public Buyer(String Name, int money) {
        this.Name = Name;
        this.money = money;
    }

    public void BuyIphone (IPhone I) {
        I.Buy(1000);
        money -= 1000;
    }
    public void BuyMac (Mac M) {
        M.Buy(2000);
        money -= 2000;
    }
    public void showInfo() {
        System.out.println(Name + "의 남은 돈은 " + money + "입니다.");
    }
}
