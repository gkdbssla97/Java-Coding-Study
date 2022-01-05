package Apple;

public class IPhone {
    int price;
    int stock = 5;
    String version;

    public IPhone (String version) {
        this.version = version;
    }
    public void Buy (int price) {
        this.price += 1000;
        stock -= 1;
    }
    public void showInfo() {
        System.out.println("아이폰" + version + " 수량은 " + stock + "이고, " +
                "총 판매금액은 " + price + "입니다.");
    }
}
