package com.company.service;

import com.company.Model.Course;
import com.company.Model.Student;
import com.company.Model.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Override
    public List<String> listSubjectForStudent(Student student) {
        List<String> courseCodes = new ArrayList<>();
        if (student.getCourses() != null) {
            for (Course course : student.getCourses()) {
                courseCodes.add(course.getCourseCode());
            }
            return courseCodes;
        } else {
            return null;
        }
    }

    @Override
    public Double getAverageGrade(Student student) {
        if (student.getCourses()==null || student.getCourses().isEmpty())
        {
            return null;
        }
        double totalGrades = 0;
       for(Course course1 :student.getCourses())
       {
           totalGrades += course1.getGrade();
       }

        return totalGrades / student.getCourses().size();

    }
}

//    @Override
//    public String studentConduct(Student student, Course course) {
//        if (course.getCourses() == null || student.getCourses().isEmpty())
//        {
//            return "No courses found for the student.";
//        }
//        double totalGrades = 0;
//        for (Student student : student.getGrade())
//        {
//            totalGrades +=course.getGrade();
//        }
//        double averageGrade = totalGrades/ student.getCourses().size();
//
//        double threshold = 70.0;
//        double averageMin = 50.0;
//
//        if (averageGrade >=threshold)
//        {
//            return "You are doing well";
//        }
//        else if (averageGrade == averageMin)
//        {
//            return "You need to do better";
//        }
//        else
//        {
//            return "You will be expel";
//        }
//    }

    ////    @Override
////    public String teacherForCourse(Teacher teacher, Course course, Student student) {
////        String SubjectTeacher = null;
////        for (Student.get)
////        return null;
//    }

