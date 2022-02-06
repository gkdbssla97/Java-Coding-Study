package Stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileInputStreamTest = null;
        int i = 0;
        try {
            fileInputStreamTest = new FileReader("input.txt");
            while((i = fileInputStreamTest.read()) != -1)
                System.out.println(i);

        } catch (IOException e) {
            System.out.println(e);
        }finally {
            try {
                fileInputStreamTest.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("end");
    }
}
