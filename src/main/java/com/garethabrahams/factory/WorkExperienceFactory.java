package com.garethabrahams.factory;

import com.garethabrahams.model.WorkExperience;
import com.garethabrahams.util.IDGenerator;

public class WorkExperienceFactory {

    public static WorkExperience createWorkExperience(String company, String city, String yearAtCompany, String role, int yearsOfService){
       String id = IDGenerator.generateID();

       return new WorkExperience.Builder()
               .workID(id)
               .company(company)
               .city(city)
               .yearAtCompany(yearAtCompany)
               .role(role)
               .yearsOfService(yearsOfService)
               .build();
    }
}
