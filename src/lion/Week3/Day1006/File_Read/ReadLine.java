package week.day3.fileread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLine {
    public void printLinesWithoutBuffer(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        int c;
        while ((c = fr.read()) != -1) {
            System.out.printf("%s \n", (char)c);
        }
    }

    public void printLines(String filename) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) throws IOException {
        ReadLine fc00 = new ReadLine();
//        fc00.printLines("8842height.phe.txt");
        fc00.printLinesWithoutBuffer("a_file.txt");
    }
}
