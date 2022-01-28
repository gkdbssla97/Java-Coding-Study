package object;

class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) { //다운캐스팅
            Student st = (Student) obj;
            if (id == st.id) return true;
            else return false;
        }
        return false;
    }
    public int hashCode() {
        return id;
    }
}
public class EqualsTest {
    public static void main(String[] args) {
        String str1 = new String("1");
        String str2 = new String("1");

        System.out.println(str1 == str2); //주솟값
        System.out.println(str1.equals(str2)); //문자비교

        Student st1 = new Student("하 윤", 19013141);
        Student st2 = new Student("하 윤", 19013141);

        System.out.println(st1 == st2);
        System.out.println(st1.equals(st2));

        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    // equals() 재정의 시, hashcode 재정의하여 동일값 반환.
    }
}
