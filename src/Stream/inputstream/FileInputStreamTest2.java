package Stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest2 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream fis = new FileInputStream("input2.txt");
            byte[] bs = new byte[10];
            int i;
            while((i = fis.read(bs)) != -1) {
                for(int j = 0; j < i; j++) {
                    System.out.print((char)bs[j]);
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
