package StaticEx;

public class Student {
    private static int SerialNum = 10000;

    int StudentId;
    String StudentName;

    /*public static void setSerialNum(int SerialNum) {
        Student.SerialNum = SerialNum;
    }*/
    public static int getSerialNum() {
        int i = 10; // 지역변수
        i++;
        System.out.println(i);

        //StudentName = "HONG"; // 멤버(인스턴스)변수

        return Student.SerialNum; // static(class)변수
    }
    public Student() {
        SerialNum++;
        StudentId = SerialNum;
    }
}
