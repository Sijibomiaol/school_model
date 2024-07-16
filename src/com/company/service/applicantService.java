package com.company.service;

import com.company.Model.Applicant;

public interface applicantService {
    String applicantInfo(Applicant applicant);
    int applicantScore(Applicant applicant);
    boolean apllicantAdmitted(Applicant applicant);

}
