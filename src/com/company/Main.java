package com.company;

import com.company.Model.*;
import com.company.service.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TeacherService teacherService = new TeacherServiceImpl();
        Teacher mathTeacher = new Teacher();
        mathTeacher.setName("Siji");
        mathTeacher.setAge(25);
        mathTeacher.setId(1);
        mathTeacher.setLevel("100L");

        Course mathSubject = new Course("Mathematics", "MTH101", mathTeacher, 70);
        Course english = new Course("English", "ENG101", mathTeacher, 80);

        List<Course> mathTeacherCourse = new ArrayList<>();
        mathTeacherCourse.add(mathSubject);
        mathTeacherCourse.add(english);
        mathTeacher.setCourse(mathTeacherCourse);


        mathTeacher.setLevel("15");

//        System.out.println(mathTeacher.getLevel());
        System.out.println(teacherService.canTeach(mathTeacher, english));


// Student
        StudentService stud = new StudentServiceImpl();
        Student newstudent = new Student();
        newstudent.setName("Aderinlewo");
        List<Course> newStudentCourse = new ArrayList<>();
        newStudentCourse.add(mathSubject);
        newStudentCourse.add(english);
        newstudent.setCourses(newStudentCourse);




        stud.getAverageGrade(newstudent);
        System.out.println(stud.getAverageGrade(newstudent));

//        Applicant
        Applicant appli = new Applicant();
        appli.setAge(10);
        appli.setScore(70);

//  Principal
        PrincipalService princ = new PrincipalServiceImplement(stud);
        System.out.println(princ.approvalAdmission(appli));
        System.out.println(princ.expulsion(newstudent));

    }
}
