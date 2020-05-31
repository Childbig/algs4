package javainaction.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ：zhangxuan
 * @date ：Created in 2019-05-21 10:48
 * @modified By：
 * @Description：
 */
public class textbook {
    public static String processFile() throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader("123.txt"))) {
            return br.readLine();
        }
    }


    public static void main(String[] args) throws IOException {
        AtomicInteger portNumber = new AtomicInteger(1337);
        Runnable r = () -> System.out.println(portNumber.get());

        String result = processFile();
    }
}
