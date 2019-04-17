package com.garethabrahams.model.Applicant;

public class ApplicantWorkExperience {

    private String company, area, yearAtCompany, role;

    private ApplicantWorkExperience(){
    }

    public String getCompany() {
        return company;
    }

    public String getArea() {
        return area;
    }

    public String getYearAtCompany() {
        return yearAtCompany;
    }

    public String getRole() {
        return role;
    }

    public ApplicantWorkExperience(ApplicantWorkExperience.Builder builder) {
        this.company = builder.company;
        this.area = builder.area;
        this.yearAtCompany = builder.yearAtCompany;
        this.role = builder.role;
    }

    public static class Builder {
        private String company;
        private String area;
        private String yearAtCompany;
        private String role;


        public ApplicantWorkExperience.Builder company(String value) {
            this.company = value;
            return this;
        }

        public ApplicantWorkExperience.Builder area(String value) {
            this.area = value;
            return this;
        }

        public ApplicantWorkExperience.Builder yearAtCompany(String value) {
            this.yearAtCompany = value;
            return this;
        }

        public ApplicantWorkExperience.Builder role(String value) {
            this.role = value;
            return this;
        }

        public ApplicantWorkExperience build() {
            return new ApplicantWorkExperience(this);
        }


    }
}
