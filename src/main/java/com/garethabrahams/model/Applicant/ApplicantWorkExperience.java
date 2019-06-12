package com.garethabrahams.model.Applicant;

public class ApplicantWorkExperience {

    private String company, area, yearAtCompany, role;
    private ApplicantCity city;

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

    public String getCity(){
        return city.getCity();
    }

    public ApplicantWorkExperience(ApplicantWorkExperience.Builder builder) {
        this.company = builder.company;
        this.area = builder.area;
        this.yearAtCompany = builder.yearAtCompany;
        this.role = builder.role;
        this.city = builder.city;
    }

    public static class Builder {
        private String company;
        private String area;
        private String yearAtCompany;
        private String role;
        private ApplicantCity city;


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

        public ApplicantWorkExperience.Builder city(ApplicantCity value){
            this.city = value;
            return this;
        }

        public ApplicantWorkExperience.Builder copy(ApplicantWorkExperience work){
            this.company = work.company;
            this.area = work.area;
            this.yearAtCompany = work.yearAtCompany;
            this.role = work.role;
            this.city = work.city;
            return this;
        }

        public ApplicantWorkExperience build() {
            return new ApplicantWorkExperience(this);
        }


    }
}
