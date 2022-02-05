package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> slist = new ArrayList<String>();
        slist.add("BB");
        slist.add("AA");
        slist.add("CC");

        Stream<String> stream = slist.stream();
        stream.forEach(s-> System.out.println(s));

        slist.stream().sorted().forEach(s-> System.out.println(s));
    }
}
