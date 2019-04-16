package com.garethabrahams.factory.Student;


import com.garethabrahams.model.Student.Student;

public class StudentFactory {

    public static Student creatStudent(String name, String surname, String id, String email, String cellphone, String address, double familyIncome) {
        return new Student.Builder()
                .name(name)
                .surname(surname)
                .id(id)
                .email(email)
                .cellphone(cellphone)
                .address(address)
                .familyIncome(familyIncome)
                .build();
    }

}
