# ReadMe

# [LIKELION] KDT BackEnd School

# **Week 3 - 10. 4 ~ 10. 7**

## **10.4(화)**

### **git & source tree 사용법**

### **.gitignore 폴더 생성, 홀수 짝수 구별, 화폐 분류하기**

## **10.5(수)**

### **Class는 왜 쓰고 어떻게 읽는가. Collection 사용법(List)**

### **InteliJ 사용해서 git push**

### **List에 String 추가. Interface 구현체 구현, 구현체 DI**

### **pojo Interface 구현체 DI 참조 ([https://youtu.be/kBMTvDrHhPw](https://youtu.be/kBMTvDrHhPw))**

## 10.6(목)

### Interface 구현체 구현하기

### Interface 구현체 Di

### List에 Student 넣기([https://youtu.be/X1yfzDzXX20](https://youtu.be/X1yfzDzXX20))

### set을 이용해 중복 제거하기

### Map - 키워드로 데이터 추출하기, 알파벳 아스키 코드를 이용해 특정 단어 개수 체크

### Java file 입출력

- FileReader를 이용해 데이터 파일 읽어오기 ( 해당 파일의 디렉토리 콘솔 창에 출력 및 해당 디렉토리의 전체 파일 콘솔창에 출력)
- 데이터 파일에서 한 글자씩 읽어오는 메서드 작성 - 두 글자, n글자, 한개의 line, 전체 line을 읽어오는 메서드 작성

## 10. 7(금)

### 대용량 데이터 읽어오기

- MDIS에서 csv파일 다운로드
- .csv → Java Object : 파일로 되어있는 데이터를 메모리로 읽어온다.
- FileRead, BufferedReader,

### 읽어온 데이터를 메모리에 올리기

### 읽어온 데이터로 데이터 분석하기 - parse 메소드 구현

- parse() 메소드를 이용하여 데이터를 파일로 저장하고 메모리 로드 시간 단축

### JavaScript 차트 그리기

- [Highcharts Demo - JSFiddle - Code Playground](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-fillopacity/)
- [Heat map | Highcharts.com](https://www.highcharts.com/demo/heatmap)
- [Highcharts | Highcharts.com](https://www.highcharts.com/demo)

### 메소드 설계에 대한 고찰

# Week 4 - 10. 10 ~ 10. 14

## 10. 11(화)

### AWS EC2

- 인스턴스 생성, 보안 포트 설정
- EC2 Ubuntu에서 Docker 설치 및 Mysql 로드

### Mysql workbench

- Mysql workbench로 Mysql 접속
- Schema 생성, 테이블 생성 후 데이터 insert
- Foreign Key와 Primary Key의 차이

## 10. 12(수)

### 알고리즘

- 최대값 구하기
- 2차원 배열에서의 최대값 구하기
- 최대값 구현 코드를 refactoring
    - method 분리, interface 적용(callback)
    - [https://youtu.be/N6EdNvNQsgI](https://youtu.be/N6EdNvNQsgI)

### File reader 구현

- File reader 구현
    - [https://youtu.be/A_M_fgto6Q8](https://youtu.be/A_M_fgto6Q8)
- Interface 적용하여 refactoring
    - [https://youtu.be/KEPdB0niRyc](https://youtu.be/KEPdB0niRyc)

### 아기사자반

- class, method 쓰는 이유
- 구구단  코드 구현 및 refacoring
- 제네릭, 다형성, 인터페이스 이해

## 10. 13(목)

### 버블정렬, 선택정렬

- 버블정렬과 삽입정렬 그 어딘가

### Gradle Build

- Gradle Build에서 Test Class 만들기
    - [https://youtu.be/Zr8GMuRhLHQ](https://youtu.be/Zr8GMuRhLHQ)
- InteliJ로 Gradle Build 완성 (ReadLineParser)
- DB로 읽어올 .sql 쿼리문 작성 (DB file read & write)
- Test Code 작성 - Gradle Build 기반 UnitTest

## 10.14(금)

### 선택 정렬, 재귀

### DB

- .sql 파일 생성
- Mysql Workbench에서 .sql파일 불러와 데이터 입력
- workbench 명령어 입력하여 데이터 분류

# Week5 - 10.17 ~ 10.21

## 10. 17(월)

### 도형 별찍기

- 직각삼각형, 피라미드 설계, 피라미드 구현

### Java DB연동과 Insert

- DB 접속정보 보안 설정(환경변수 설정)
- Mysql schema 생성 후 자바로 data insert

### select 구현

## 10. 18(화)

### 도형 별 찍기

- 직사각형, 정사각형
- 재귀를 이용하여 별 찍기

### DB 코드 구현 및 refactoring

- Insert & select 구현
- addAndSelect 구현 - testcode 작성
- 관심사의 분리(토비의 스프링) - refactoring
- class 추상화
- interface 적용

## 10. 19(수)

### Stack 구현

- Stack pop, push 구현
- test code 작성

### Spring 코드 구현 및 refactoring

- connection object class(interface)로 분리 및 test code 수정
- Factory 적용 - UserDaoFactory, UserDaoTest 작성
- maven repository에서 spring boot starter jdbc 연동
- Spring 적용 - test code refactoring
- Spring (IoC container = ApplicationContext)
- Spring - Singleton 패턴