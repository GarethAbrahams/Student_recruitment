package com.garethabrahams.factory;


import com.garethabrahams.model.Student;

public class StudentFactory {

    public static Student creatStudent(String name, String surname, String id, String email, String cellphone) {
        return new Student.Builder()
                .name(name)
                .surname(surname)
                .id(id)
                .email(email)
                .cellphone(cellphone)
                .build();
    }

}
