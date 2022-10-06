package week.day3.fileread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExercise {
    public static void main(String[] args) throws FileNotFoundException {
        // ./ (현재의 디렉토리를 지정하는 것)
        //file을 읽어보자. 근데 나는 여기에 없음
//        FileReader fileReader = new FileReader("./a_file");

        //파일의 경로를 찾아보자. 디렉토리로 접근하는 방법
        File dir = new File("./");
        File files[] = dir.listFiles();
        System.out.println(files[0]); // 현재 디렉토리의 첫번째 파일 읽기  ./Java1006.iml

        for(File file : files) {
            System.out.println(file); // 현재 디렉토리에 있는 파일들을 전부 출력
        }
    }
}
/*
/Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=50675:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/moomin/IdeaProjects/Java1006/out/production/Java1006 week.day3.fileread.FileExercise
./Java1006.iml
./Java1006.iml
./.DS_Store
./out
./a_file
./.idea
./src

Process finished with exit code 0

 */