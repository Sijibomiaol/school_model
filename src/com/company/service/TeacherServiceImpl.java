package com.company.service;

import com.company.Model.Course;
import com.company.Model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherServiceImpl implements TeacherService {

        @Override
        public boolean canTeach(Teacher teacher, Course course) {

//
          return teacher.getCourse() != null && teacher.getCourse().contains(course.getCourseCode());

        }

        public List<String> list_subject(Teacher teacher)
        {
            List<String>  subjects = new ArrayList<>();
            if (teacher.getCourse() != null)
            {
                for (Course course:teacher.getCourse())
                {
                    subjects.add(course.getCourseCode());
                }
            }
            return subjects;
        }



}

