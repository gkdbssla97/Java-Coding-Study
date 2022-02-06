package Stream.outputstream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        try (FileWriter fw = new FileWriter("write.txt")) {
            fw.write("A");
            char [] cbuf = {'B', 'C', 'D'};
            fw.write(cbuf);
        };

    }
}
