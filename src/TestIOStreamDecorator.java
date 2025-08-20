import com.decorator.iostream.CaesarCipherInputStream;
import com.decorator.iostream.LowerCaseInputStream;
import com.decorator.iostream.UpperCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestIOStreamDecorator {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new CaesarCipherInputStream(new BufferedInputStream(new FileInputStream("test.txt")));

            while ((c = in.read()) > 0){
                System.out.print((char)c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}