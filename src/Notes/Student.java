package Notes;

import java.util.Arrays;

public class Student implements Comparable<Student> {

    private String name;
    private int grade;

    public Student(int grade) {
        this.grade = grade;
    
    }

    @Override
    public String toString() {
        return "Grade: " + grade;   
    }

    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        return this.grade - o.grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

}