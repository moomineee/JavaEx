package week.day3.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    private List<String> students;

    public ListExercise() {
        this.students = new ArrayList<>();
        this.students.add("박기문");
    }

    public List<String> getStudents() {
        return students;
    }
}
