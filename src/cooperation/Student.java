package cooperation;

public class Student {
    String student_name;
    int grade;
    int money;

    public Student(String student_name, int money) {
        this.student_name = student_name;
        this.money = money;
    }
    public void takebus(Bus bus) {
        bus.take(1000);
        money -= 1000;
    }
    public void takesub(Subway sub) {
        sub.take(1500);
        money -= 1500;
    }
    public void showInfo() {
        System.out.println(student_name + "남은 돈은" +
                money + "입니다.");
    }
}
