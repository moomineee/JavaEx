package week3.day4;

import java.util.List;
// List<T>를 리턴하는 인터페이스를 설계
// T는 구현체라 바꿀 수 있기 때문.
// T가 PopulationMove가 될 수도 있고
//T가 Patient
//T가 Student될 수 있음.
public interface DoSomething<T> { // 타입을 넣어줌. 파싱을 할때 리스트로 파싱
    List<T> work(String str);

}
