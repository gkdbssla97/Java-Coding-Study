package classPart;

public class Student {
    // Property attribute 멤버변수
    int studentID;
    String studentName;
    int grade;
    String address; //문자열 String java type

    // 메서드 추가
    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
