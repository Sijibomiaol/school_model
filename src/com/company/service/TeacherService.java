package com.company.service;

import com.company.Model.Course;
import com.company.Model.Teacher;

import java.util.List;

public interface TeacherService {
    boolean canTeach(Teacher teacher, Course course);
    List<String> list_subject(Teacher teacher);

}

