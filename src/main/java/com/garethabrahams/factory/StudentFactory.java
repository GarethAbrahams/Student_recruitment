package com.garethabrahams.factory;


import com.garethabrahams.model.Student;

public class StudentFactory {

    public static Student creatStudent(String name, String surname, String id, String email, String cellphone, String address, String school, double familyIncome) {
        return new Student.Builder()
                .name(name)
                .surname(surname)
                .id(id)
                .email(email)
                .cellphone(cellphone)
                .address(address)
                .school(school)
                .familyIncome(familyIncome)
                .build();
    }

}
