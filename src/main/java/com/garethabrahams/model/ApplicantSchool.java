package com.garethabrahams.model;

public class ApplicantSchool {

    private String schoolName, area, province, yearMatric;
    private ApplicantCity city;

    private ApplicantSchool() {
    }

    public String getSchoolname() {
        return schoolName;
    }

    public String getArea() {
        return area;
    }

    public String getProvince() {
        return province;
    }

    public String getYearMatric() {
        return yearMatric;
    }

    public String getCity(){return city.getCity();}

    public ApplicantSchool(ApplicantSchool.Builder builder) {
        this.schoolName = builder.schoolName;
        this.area = builder.area;
        this.province = builder.province;
        this.yearMatric = builder.yearMatric;
        this.city = builder.city;
    }

    public static class Builder {
        private String schoolName;
        private String area;
        private String province;
        private String yearMatric;
        private ApplicantCity city;


        public ApplicantSchool.Builder schoolName(String value) {
            this.schoolName = value;
            return this;
        }

        public ApplicantSchool.Builder area(String value) {
            this.area = value;
            return this;
        }

        public ApplicantSchool.Builder province(String value) {
            this.province = value;
            return this;
        }

        public ApplicantSchool.Builder yearMatric(String value) {
            this.yearMatric = value;
            return this;
        }

        public ApplicantSchool.Builder city(ApplicantCity value){
            this.city = value;
            return this;
        }

        public ApplicantSchool.Builder copy(ApplicantSchool school){
            this.schoolName = school.schoolName;
            this.area = school.area;
            this.province = school.province;
            this.yearMatric = school.yearMatric;
            this.city = school.city;
            return this;
        }

        public ApplicantSchool build() {

            return new ApplicantSchool(this);
        }


    }
}
