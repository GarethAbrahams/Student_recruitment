package com.garethabrahams.factory;

import com.garethabrahams.model.StudentSchool;

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
