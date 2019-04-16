package com.garethabrahams.factory.Student;

import com.garethabrahams.model.Student.StudentCity;

public class StudentCityFactory {
    public static StudentCity creatStudentCity(String city) {
        return new StudentCity.Builder()
                .city(city)
                .build();
    }
}
