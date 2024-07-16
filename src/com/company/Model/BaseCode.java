package com.company.Model;

abstract public class BaseCode {
    String name;
    int Id;
    int age;
    String role;
    static  String school_name = "Bethel Wisdom College";

    public BaseCode(String name, int id, int age, String role) {
        this.name = name;
        Id = id;
        this.age = age;
        this.role = role;
    }

    public BaseCode() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public static String getSchool_name() {
        return school_name;
    }

    public static void setSchool_name(String school_name) {
        BaseCode.school_name = school_name;
    }

    @Override
    public String toString() {
        return "BaseCode{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", age=" + age +
                ", role=" + role +
                '}';
    }
}
