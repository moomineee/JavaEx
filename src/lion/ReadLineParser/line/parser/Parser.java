package com.line.parser;

public interface Parser<T> { // 다형성 적용 <T>
    T parse(String str); // T를 리턴. 인터페이스 선언 stirng으로 받음. 파일이 string이니까.

}
