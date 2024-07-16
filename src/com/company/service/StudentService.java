package com.company.service;

import com.company.Model.Course;
import com.company.Model.Student;
import com.company.Model.Teacher;

import java.util.List;

public interface StudentService  {
    List<String> listSubjectForStudent (Student student);
//    String teacherForCourse(Teacher teacher, Course course, Student student);
        Double getAverageGrade(Student student);
//    String studentConduct(Student student);
}
