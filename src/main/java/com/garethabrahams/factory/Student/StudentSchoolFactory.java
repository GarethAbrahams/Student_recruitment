package com.garethabrahams.factory.Student;

import com.garethabrahams.model.Student.StudentSchool;

public class StudentSchoolFactory {

    public static StudentSchool createSchool(String schoolName, String area, String province, String yearMatric){
        return new StudentSchool.Builder()
                .schoolName(schoolName)
                .area(area)
                .province(province)
                .yearMatric(yearMatric)
                .build();
    }

}
