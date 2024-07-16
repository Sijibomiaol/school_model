package com.company.Model;

import java.util.List;

public class Teacher extends BaseCode {
    private String level;
    private List<Course> course;

    public Teacher(String name, int id, int age, String role, String level, List<Course> course) {
        super(name, id, age, role);
        this.level = level;
        this.course = course;
    }

    public Teacher(String level, List<Course> course) {
        this.level = level;
        this.course = course;
    }

    public Teacher() {
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", age=" + age +
                ", role='" + role + '\'' +
                ", level='" + level + '\'' +
                ", course=" + course +
                '}';
    }
}
