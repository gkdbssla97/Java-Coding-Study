package StaticEx;

public class Student_Test1 {
    public static void main(String[] args) {
        System.out.println(Student.getSerialNum());

        Student J = new Student();
        Student K = new Student();

        System.out.println(J.StudentId);
        System.out.println(K.StudentId);
        System.out.println(Student.getSerialNum());
    }
}

