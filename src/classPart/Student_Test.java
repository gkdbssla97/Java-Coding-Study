package classPart;

public class Student_Test {
    public static void main(String[] args) {
        int i = 10;

        Student a = new Student(100, "LEE");
        // a는 참조변수
        a.address = "영등포";

        Student b = new Student();
        b.studentName = "KIM";
        b.studentID = 101;
        b.address = "산호세";

        a.showStudentInfo();
        b.showStudentInfo();
        System.out.println(a);
        System.out.println(b);
    }
}
