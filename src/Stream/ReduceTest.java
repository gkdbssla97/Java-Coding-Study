package Stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

    @Override
    public String apply(String s1, String s2) {
        if(s1.getBytes().length <= s2.getBytes().length)
            return s1;
        else return s2;
    }
}
public class ReduceTest {
    public static void main(String[] args) {
        String[] strings = {"하이", "안녕~~~~","hello","ChingThao"};

        System.out.println(Arrays.stream(strings).reduce("",(s1, s2)->{
            if(s1.getBytes().length >= s2.getBytes().length)
                return s1;
            else return s2;
        }));
        String str = Arrays.stream(strings).reduce(new CompareString()).get();
        System.out.println(str);
    }
}
