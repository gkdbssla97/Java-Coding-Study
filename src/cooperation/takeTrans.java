package cooperation;

import reference.Subject;

public class takeTrans {
    public static void main(String[] args) {
        Student Joshua = new Student("Joshua", 10000);
        Student Thomas = new Student("Thomas", 5000);

        Bus bus100 = new Bus(100);
        Joshua.takebus(bus100);
        Joshua.showInfo();
        bus100.showInfo();

        Subway sub2 = new Subway(2);
        Thomas.takesub(sub2);
        Thomas.showInfo();
        sub2.showInfo();
    }
}
