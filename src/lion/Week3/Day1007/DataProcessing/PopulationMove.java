package week3.day4;

import java.util.HashMap;
import java.util.Map;

public class PopulationMove {

    private int fromSido; // 이렇게 되있으면 값을 뽑아서 쓸 수 없음 getter 사용
    private int toSido; // 이렇게 되있으면 값을 뽑아서 쓸 수 없음 getter 사용
    private String fromSidoKorean;
    private String toSidoKorean;
    private Map<Integer, String> sidoMap = new HashMap<>();
    public int getFromSido() { // getter 추가.
        return fromSido;
    }

    public int getToSido() { // getter 추가.
        return toSido;
    }

    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
        this.setSidoMap();
        this.fromSidoKorean = this.sidoMap.get(fromSido);
        this.toSidoKorean = this.sidoMap.get(toSido);

    //constructor 추가 from Sido, toSido를 받아서 멤버변수에 넣는 기능
    // constructor overloading. populationMove에서 해줘야함
    public PopulationMove(String fromSido, String toSido) {
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
        this.setSidoMap();
        this.fromSidoKorean = this.sidoMap.get(fromSido);
        this.toSidoKorean = this.sidoMap.get(toSido);
    }

    private void setSidoMap() {
        sidoMap.put(11,"서울특별시");
        sidoMap.put(21,"부산광역시");
        sidoMap.put(22,"대구광역시");
        sidoMap.put(23,"인천광역시");
        sidoMap.put(24,"광주광역시");
        sidoMap.put(25,"대전광역시");
        sidoMap.put(26,"울산광역시");
        sidoMap.put(29,"세종특별자치시");
        sidoMap.put(31,"경기도");
        sidoMap.put(32,"강원도");
        sidoMap.put(33,"충청북도");
        sidoMap.put(34,"충청남도");
        sidoMap.put(35,"전라북도");
        sidoMap.put(36,"전라남도");
        sidoMap.put(37,"경상북도");
        sidoMap.put(38,"경상남도");
        sidoMap.put(39,"제주특별자치도");
    }


    // [설계]
    // 50,130,62000,2021,12,20,26,350,52000,1,1,027,2,,,,,,,,,,,,,,,,,,,,,,,,,,,,528528
    // data 한 줄을 받아서 PopulationMove를 만든다.
    // 3. 한줄의 데이터를 PopulationMove로 만드는 기능
    // > public PopulationMove parse(String Line or data) parse란?

    // Method를 어떻게 설계해야 할까? Method 설계란 뭔가? ex) 'void readByChar(String filename)
    // Method - 단일 책임의 원칙 : Method는 한개의 기능만 담당
    // 1. filename을 받아서 파일을 읽는 기능(read String(filename))
    // 2. 읽은 파일을 ,로 split하는 기능
    // 3. 한줄의 데이터를 PopulationMove로 만드는 기능
    // method(function)의 설계 = programming. Method(기능)을 조합하는 것.
    // Method 이름은 어떤 기능을 하는지 알 수 있도록 지어야 한다.
    // 컴파일
    // 사람이 짠 소스코드를 컴퓨터가 빠르게 읽을 수 있게 변환
    // javac — 컴파일 명령 Intellij가 자동으로 해줌
    // 논리적 설계 – 기능이 어떤 것인지 써보는 것
    // 물리적 설계 – Java로 코딩하면 어떤 모양이 될것인지 써보는 것
    // 구현 – 설계 해놓은 것으로 코딩






}
