package week3.day4;

import java.io.IOException;
import java.util.List;

public class Main {

    //ReadLineContext를 생성할 때 Type을 넣어서 생성
    public static void main(String[] args) throws IOException {
        ReadLineContext<PopulationMove> readLineContext =
                new ReadLineContext<>(); // 여기에 ReadLineContext를 new 할 때
                                        // Parsing 로직(DoSomething의 구현체를 넣어서 생성한다.)
                                        // 이런걸 context라고 한다.
        List<PopulationMove> result = readLineContext.readByLine("");
    }
}
