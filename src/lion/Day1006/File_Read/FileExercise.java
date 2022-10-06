package week.day3.fileread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExercise {
    public char readAChar(String filename) throws IOException {

        FileReader fileReader = new FileReader("a_file.txt");

        return (char) fileReader.read();
    }

    public static void main(String[] args) throws IOException {
        FileExercise fileExercise = new FileExercise();
        char c = fileExercise.readAChar("a_file.txt");
        System.out.println(c);
    }
}
/*
(현재의 디렉토리를 지정하는 것)
//file을 읽어보자. 근데 나는 여기에 없음
//FileReader fileReader = new FileReader("./a_file");
public void printFiles() {
//파일의 경로를 찾아보자. 디렉토리로 접근하는 방법
File dir = new File("./");
File files[] = dir.listFiles();
System.out.println(files[0]); // 현재 디렉토리의 첫번째 파일 읽기  ./Java1006.iml

for (File file : files) {
System.out.println(file); // 현재 디렉토리에 있는 파일들을 전부 출력

 */
