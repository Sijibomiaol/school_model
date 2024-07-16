package com.company.Model;

public class Course {
    private String courseTitle;
    private String courseCode;
    private Teacher teacher;
    private double grade;

    public Course(String courseTitle, String courseCode, Teacher teacher, double grade) {
        this.courseTitle = courseTitle;
        this.courseCode = courseCode;
        this.teacher = teacher;
        this.grade = grade;
    }

    public Course() {
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseTitle='" + courseTitle + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", teacher=" + teacher +
                ", grade=" + grade +
                '}';
    }
}

