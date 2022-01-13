package ArrayList;

import java.util.ArrayList;

public class Student {
    private int ID;
    private String StudentName;
    private ArrayList<Subject> SubjectList;

    public Student(int ID, String StudentName) {
        this.ID = ID;
        this.StudentName = StudentName;

        SubjectList = new ArrayList<Subject>();
    }
    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setSubname(name);
        subject.setScore(score);

        SubjectList.add(subject);
    }
    public void showInfo() {
        int total = 0;
        for(Subject subject : SubjectList) {
            total += subject.getScore();
            System.out.println("학생" + StudentName + "님의" +
                    subject.getSubname() + "과목의 성적은" +
                    subject.getScore());
        }
        System.out.println("학생" + StudentName + "의 총점은 " +
                total + "점 입니다");
    }
}
