package com.company.Model;

import java.util.List;

public class Student extends BaseCode {
    private String student_class;
    private List<Course> courses;
    private String conduct;

    public Student(String name, int id, int age, String role, String student_class, List<Course> courses, String conduct) {
        super(name, id, age, role);
        this.student_class = student_class;
        this.courses = courses;
        this.conduct = conduct;
    }

    public Student(String student_class, List<Course> courses, String conduct) {
        this.student_class = student_class;
        this.courses = courses;
        this.conduct = conduct;
    }

    public Student() {
    }

    public String getStudent_class() {
        return student_class;
    }

    public void setStudent_class(String student_class) {
        this.student_class = student_class;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public String getConduct() {
        return conduct;
    }

    public void setConduct(String conduct) {
        this.conduct = conduct;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", age=" + age +
                ", student_class='" + student_class + '\'' +
                ", courses=" + courses +
                ", conduct='" + conduct + '\'' +
                '}';
    }
}
