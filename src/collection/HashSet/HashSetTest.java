package collection.HashSet;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> myh = new HashSet<String>();

        boolean a = myh.add("AAA");
        myh.add("BBB");
        myh.add("CCC");

        System.out.println(myh);
        boolean b = myh.add("AAA");
        System.out.println(a);
        System.out.println(b);
        System.out.println(myh);
    }
}
