
class Student {

    String name ;
    int ban;
    int kor;
    int no;
    int eng;
    int math;

    Student() {} // 기본생성자. 이 기본 생성자로 인하여 클래스에 접근할 수 있다.
    Student(String name, int kor, int eng, int math, int no, int ban) { //매개변수가 있는 생성자로 초기화 = 값을 저장
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }
    int getTotal () {  //총점 구하기
        return kor+eng+math;
    }
    float getAvg() { // 평균 구하기. 소수 둘째자리에서 반올림하기.
        return (int)(getTotal()/3f*10 + 0.5f) / 10f;
    }

    public String info () { // String 타입으로 저장하므로 이런 형식이 가능한 듯. 써먹자
        return name + "," + ban + "," + no + "," + kor + ","
                + eng +"," + math + "," + getTotal() + "," + getAvg();
    }
}


public class Oop6_2 {
    public static void main(String[] args) {
        // 6-2 연습문제

        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }
}
