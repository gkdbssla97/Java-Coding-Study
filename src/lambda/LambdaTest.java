package lambda;

interface PrintString {
    void showString(String str);
}
public class LambdaTest {
    public static void main(String[] args) {
        PrintString printString = str-> System.out.println(str);
        printString.showString("LAMBDA");

        showMyString(printString);
    }
    public static void showMyString(PrintString p) {
        p.showString("LABMDA2");
    }
}
