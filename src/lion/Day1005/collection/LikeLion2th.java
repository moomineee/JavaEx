package collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    private List<String> students = new ArrayList<>();
    private List<Student> studentObjs = new ArrayList<>();

    public LikeLion2th() { // 생성자
        names names = new names();
        this.students = names.names();
    }
    //멋사 2기 학생의 이름이 들어있는 list를 return하는 method
    //return 해야되니까 void 안됨
    public List<String> getStudentList() {
        return this.students;
    }
}
