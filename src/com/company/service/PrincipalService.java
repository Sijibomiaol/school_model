package com.company.service;

import com.company.Model.Applicant;
import com.company.Model.Course;
import com.company.Model.Principal;
import com.company.Model.Student;

public interface PrincipalService {
    String principalInfo(Principal principal);
    String approvalAdmission(Applicant applicant);
    String expulsion(Student student);
}
