package com.garethabrahams.factory;

import com.garethabrahams.model.ApplicantQualification;
import com.garethabrahams.model.Course;

public class ApplicantQualificationFactory {
    public static ApplicantQualification createApplicantQualification(String QualificationName, String yearObtained, Course course){
        return new ApplicantQualification.Builder()
                .QualificationName(QualificationName)
                .yearObtained(yearObtained)
                .course(course)
                .build();
    }
}
