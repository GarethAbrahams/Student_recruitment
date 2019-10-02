package com.garethabrahams.model;

public class WorkExperience {

    private String workID;
    private String company, city, yearAtCompany, role;
    private int yearsOfService;

    private WorkExperience(){
    }

    public String getWorkID(){
        return workID;
    }

    public String getCompany() {
        return company;
    }

    public String getCity() {
        return city;
    }

    public String getYearAtCompany() {
        return yearAtCompany;
    }

    public String getRole() {
        return role;
    }

    public int getYearsOfService(){
        return yearsOfService;
    }

    public WorkExperience(WorkExperience.Builder builder) {
        this.workID = builder.workID;
        this.company = builder.company;
        this.city = builder.city;
        this.yearAtCompany = builder.yearAtCompany;
        this.role = builder.role;
        this.yearsOfService = builder.yearsOfService;
    }

    public static class Builder {
        private String workID;
        private String company;
        private String city;
        private String yearAtCompany;
        private String role;
        private int yearsOfService;

        public WorkExperience.Builder workID(String value){
            this.workID = value;
            return this;
        }

        public WorkExperience.Builder company(String value) {
            this.company = value;
            return this;
        }

        public WorkExperience.Builder city(String value) {
            this.city = value;
            return this;
        }

        public WorkExperience.Builder yearAtCompany(String value) {
            this.yearAtCompany = value;
            return this;
        }

        public WorkExperience.Builder role(String value) {
            this.role = value;
            return this;
        }

        public WorkExperience.Builder yearsOfService(int value){
            this.yearsOfService = value;
            return this;
        }

        public WorkExperience.Builder copy(WorkExperience work){
            this.workID = work.workID;
            this.company = work.company;
            this.city = work.city;
            this.yearAtCompany = work.yearAtCompany;
            this.role = work.role;
            this.yearsOfService = work.yearsOfService;
            return this;
        }

        public WorkExperience build() {
            return new WorkExperience(this);
        }


    }
}
