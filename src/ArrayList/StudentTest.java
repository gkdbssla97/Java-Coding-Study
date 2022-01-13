package ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student Lee = new Student(1000, "Lee");
        Lee.addSubject("Math", 96);
        Lee.addSubject("Eng", 97);

        Lee.showInfo();

        Student Kim = new Student(1001, "Kim");
        Kim.addSubject("Math", 86);
        Kim.addSubject("Eng", 87);

        Kim.showInfo();

    }
}
