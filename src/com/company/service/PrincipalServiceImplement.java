package com.company.service;

import com.company.Model.Applicant;
import com.company.Model.Course;
import com.company.Model.Principal;
import com.company.Model.Student;

public class PrincipalServiceImplement implements PrincipalService {
    private final StudentService studentService;

    public PrincipalServiceImplement(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public String principalInfo(Principal principal) {
        if (principal.getRole().equalsIgnoreCase("Principal"))
            return principal.toString();
        else
        {
            return "You are not the Principal";
        }
    }

    @Override
    public String approvalAdmission(Applicant applicant) {
        if (applicant.getScore()>=50 && applicant.getAge()>=10)
        {
            return "Welcome to Bethel Wisdom College";
        }
        else
        {
            return  "Sorry! You are not Admitted ";
        }
    }

    @Override
    public String expulsion(Student student) {
        Double averageGrade = studentService.getAverageGrade(student);
        if (averageGrade < 50)
        {
         return "You been expel from the school";
        }
        else
        {
            return "You've been promoted";
        }
    }

//    @Override
//    public String expulsion(Course course, Student student) {
//        if ()
//        return null;
//    }
}
