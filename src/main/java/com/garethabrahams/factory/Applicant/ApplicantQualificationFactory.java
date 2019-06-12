package com.garethabrahams.factory.Applicant;

import com.garethabrahams.model.Applicant.ApplicantQualification;
import com.garethabrahams.model.General.Course;

public class ApplicantQualificationFactory {
    public static ApplicantQualification createApplicantQualification(String QualificationName, String yearObtained, Course course){
        return new ApplicantQualification.Builder()
                .QualificationName(QualificationName)
                .yearObtained(yearObtained)
                .course(course)
                .build();
    }
}
