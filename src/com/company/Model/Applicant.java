package com.company.Model;

public class Applicant {
    private String applicant;
    private int age;
    private int score;

    public Applicant(String applicant, int age, int score) {
        this.applicant = applicant;
        this.age = age;
        this.score = score;
    }

    public Applicant() {
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "applicant='" + applicant + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
