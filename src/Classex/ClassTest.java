package Classex;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        Class pClass = person.getClass(); // Object 메서드

        System.out.println(pClass.getName());

        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("java.lang.String");
        System.out.println(pClass3.getName());
    }
}
