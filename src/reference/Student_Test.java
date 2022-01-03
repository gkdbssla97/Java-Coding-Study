package reference;

public class Student_Test {
    public static void main(String[] args) {
        Student a = new Student(103, "HA");
        Student b = new Student(104, "PARK");
        a.setKorea(100);
        a.setMath(100);

        b.setKorea(40);
        b.setMath(60);

        a.showStudentInfo();
        b.showStudentInfo();
    }
}
