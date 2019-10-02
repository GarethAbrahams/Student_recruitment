package com.garethabrahams.factory;

import com.garethabrahams.model.School;
import com.garethabrahams.util.IDGenerator;

public class SchoolFactory {

    public static School createSchool(String schoolName, String city, String yearMatric){
        String id = IDGenerator.generateID();

        return new School.Builder()
                .schoolID(id)
                .schoolName(schoolName)
                .city(city)
                .yearMatric(yearMatric)
                .build();
    }
}