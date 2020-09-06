package lahuman.third;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    public static void main(final String[] args) throws IOException {
        System.out.println(processFile());
        System.out.println(processFileLambda((BufferedReader br)->br.readLine() + "\r\n" + br.readLine()));
    }

    public static String processFileLambda(final ProcessFile p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            return p.processFile(br);
        }
    }

    public static String processFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            return br.readLine();
        }
    }

    @FunctionalInterface
    public interface ProcessFile {
        String processFile(BufferedReader br) throws IOException;
    }
}
