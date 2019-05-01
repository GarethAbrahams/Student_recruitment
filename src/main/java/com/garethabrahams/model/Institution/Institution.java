package com.garethabrahams.model.Institution;

import com.garethabrahams.model.Applicant.ApplicantCity;

public class Institution {

    private String institutionName;
    private ApplicantCity institutionCity;

    private Institution(){
    }

    public String getInstitutionName(){
        return institutionName;
    }

    public String getInstitutionCity(){
        return institutionCity.getCity();
    }

    public Institution (Builder builder) {
        this.institutionName = builder.institutionName;
        this.institutionCity = builder.institutionCity;

    }

    public static class Builder {
        private String institutionName;
        private ApplicantCity institutionCity;

        public Institution.Builder institutionName(String value) {
            this.institutionName = value;
            return this;
        }

        public Institution.Builder institutionCity(ApplicantCity value) {
            this.institutionCity = value;
            return this;
        }

        public Institution.Builder copy(Institution institution){
            this.institutionName = institution.institutionName;
            this.institutionCity = institution.institutionCity;
            return this;
        }

        public Institution build() {
            return new Institution(this);
        }


    }
}
