package String;

public class StringTest {
    public static void main(String[] args) {
        String str2 = new String("android");
        String str1 = new String("java");

        System.out.println(System.identityHashCode(str1));
        str1 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(System.identityHashCode(str1));
    }

}
