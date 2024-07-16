package com.company.Model;

public class Principal extends BaseCode{
    Applicant applicant;
    Student student;
    Course course;

    public Principal(String name, int id, int age, String role, Applicant applicant, Student student, Course course) {
        super(name, id, age, role);
        this.applicant = applicant;
        this.student = student;
        this.course = course;
    }

    public Principal(Applicant applicant, Student student, Course course) {
        this.applicant = applicant;
        this.student = student;
        this.course = course;
    }

    public Principal() {
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", age=" + age +
                ", role=" + role +
                '}';
    }
}
