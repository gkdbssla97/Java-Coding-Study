package lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        StringConcatTmp1 sTmp1 = new StringConcatTmp1();
        sTmp1.makeString("Hello", "World");

        StringConcat concat = (s1, s2)-> System.out.println(s1 + " " + s2);
        concat.makeString("Hello", "World");
    }
}
