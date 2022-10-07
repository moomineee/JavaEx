package week3.day4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class PopulationStatistics {

    public void readByChar(String filename) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filename);
    }


    // while문 안에서 string을 PopulationMove로 parsing하여 pml에 add합니다.
    //루프가 끝나면(파일을 모두 읽어서 파싱을 끝냈으면) return합니다.
    public List<PopulationMove> readByLine(String filename) throws IOException { // 메소드 추가. // 파일의 주소를 파리미터로 받는 메소드. 파일 주소를 편하게 쓰고 싶다.
        // 삽을 이용해서 푼다.  " 여기에 parse를 쓰면 된다."
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String str;
        while ((str = reader.readLine()) != null) {
//            System.out.println(str); // print하면 속도가 느려
            PopulationMove pm = parse(str);  // parse를 추가하여 data 출력. 여기에 oop 적용해보자.
            pml.add(pm);
        }                                    // readByLine은 어떤 파일에도 적용할 수 있다.
        reader.close();
        return pml;                         // parse는 바뀔 수 있다. csv파일이 아닌 목록 파일의 경우.
    }                                       // void를 <List>PopulationMove로 바꾸면 ????? < 질문
                                            // oop를 적용해서 PopulationMove pm = parse(str);를 갈아끼우면 좋겠다. 어떻게?
                                            // interface를 적용해서

    public void readAllLines(String filename) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);
        List<PopulationMove> pms = lines.parallelStream()
                .map(item -> {
                    String[] splittedLine = item.split(",");
                    return new PopulationMove(splittedLine[0], splittedLine[6]);
                }).collect(Collectors.toList());
        for (PopulationMove pm : pms) {
            System.out.println(pm.getFromSido());
        }
    }


    public void readByLine2(String filename) {
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get("afile.txt"), StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //parsing 하는 로직을 바꿔야 함. 6,0 을 0,1로.
    public PopulationMove parse(String data) { // parse 메소드 구현
//        String data = "50,130,62000,2021,12,20,26,350,52000,1,1,027,2,,,,,,,,,,,,,,,,,,,,,,,,,,,,528528";
        String[] splittedLine = data.split(",");
        return new PopulationMove(splittedLine[0], splittedLine[1]); // 전입 to, 전출 from
    }

    public void createAFile(String filename) { //from_to.txt 파일이 생성된다.
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //List<String>을 지정한 파일에 write
    public void write(List<String> strs, String filename) {
        File file = new File(filename);
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                for (String str : strs) {
                    writer.write(str);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido()+","+populationMove.getToSido()+"\n";
    }

    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {
        for (PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if (moveCntMap.get(key) == null) {
                moveCntMap.put(key, 1);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
        }
    return moveCntMap;
    }


    public static void main(String[] args) throws IOException {

//        String address = "/Users/moomin/Downloads/2021_인구관련연간자료_20220927_66125.csv";
        String address = "./from_to.txt";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readByLine(address);

         // A~Z
        Map<String, Integer> map = populationStatistics.getMoveCntMap(pml);
        ps.createAFile("each_sido_cnt.txt         ")
        for(String key : map.keySet()) {
            System.out.printf("key:%s value:%d\n", key, map.get(key));
        }
    }

//        List<String> strings = new ArrayList<>();
//        for (PopulationMove pm : pml) {
//            System.out.printf("전입:%s, 전출:%s%n", pm.getFromSido(), pm.getToSido());
//        }
//
//        Set<Integer> sidoCodes = new HashSet<>();
//        for (PopulationMove pm : pml) {
//            sidoCodes.add(pm.getFromSido());
//            sidoCodes.add(pm.getToSido());
//        }
//        System.out.println(sidoCodes);
//    }

//                        String fromTo = populationStatistics.fromToString(pm);
//            strings.add(fromTo);
//        }
//
//        System.out.println(strings.size());
//
//    populationStatistics.write(strings,"./from_to.txt");


//        strings.add("11,11");
//        populationStatistics.write(strings, "./from_to.txt");
//        populationStatistics.createAFile("./from_to.txt");

//        System.out.println(pml.size());
//        for (PopulationMove pm : pml) {
//            System.out.printf("전입:%s, 전출:%s%n", pm.getFromSido());
//        }
//        System.out.println(pml.size());
        // 500Mb를 매번 읽는 것은 부담. 왜? 한번 실행할 때 매번 500mb씩 parsing을 하기 때문.
        // 파일을 메모리로 로드하는데 10초가량 걸리기 때문. 시간이 너무 오래걸린다.
        // 그래서 파일로 저장함 > 파일 생성하기 (강사님 티스토리)


//         한 줄의 데이터
//        String data = "50,130,62000,2021,12,20,26,350,52000,1,1,027,2,,,,,,,,,,,,,,,,,,,,,,,,,,,,528528";
//         Split으로 자르기
//        String data2 = "김경록%김미미%김영환";
//        String[] splitted = data.split(",");
//        System.out.println(Arrays.toString(splitted)); // ar to str 배열을 잘라서 콘솔에 출력
//        위의 배열은 컴퓨터가 하나로 인식함. 근데 split으로 자르면 , 단위로 나누어 인식하게 됨.
//        PopulationMove pm = populationStatistics.parse(data);
//        System.out.println(pm.getFromSido());
//        System.out.println(pm.getToSido());


//        주소 가져오기
//        String address = "/Users/moomin/Downloads/2021_인구관련연간자료_20220927_66125.csv";
//        FileReader fileReader = new FileReader(address); // 파일 하나의 용량이 크기 때문에 FileReader로 읽는게 느릴까?
//                                                        // 파일의 adress를 지정해주면 파일 전체를 읽지 않는다. read를 해야 파일을 읽는다.
//       //대용량의 파일을
//        char c = (char)fileReader.read(); // read는 int 를 반환하므로 casting
//        System.out.println(c);
//
//        byte 단위로 read
//        String fileContents = "";
//        while ( fileContents.length() < 1_000_000) { // 백만개될 때까지 파일을 1byte씩 read해라
//            char c = (char)fileReader.read();
//            fileContents += c;
//            //System.out.println(fileContents);// 이해가 안가면 루프문 안에 변수를 넣어서 읽어봐라. 1byte씩 읽고 있다.
//        }
//        System.out.println(fileContents); // 이게 모래 한알씩 옮기는 것. 엄청나게 오래걸린다.
//        //그래서 bufferedReader를 써야한다.
//    }
//}
