package week.day3.fileread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadByte {

    private String filename;
    private int n;

    public ReadByte(String filename, int n) {
        this.filename = filename;
        this.n = n;
    }

    char readOneByte() throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );
        for(int i = 1; i < n; i++) {
            System.out.print((char) br.read());
        }
        return (char)br.read();
    }
}
