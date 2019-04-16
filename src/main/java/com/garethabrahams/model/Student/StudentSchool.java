package com.garethabrahams.model.Student;

public class StudentSchool {

    private String schoolName, area, province, yearMatric;

    private StudentSchool() {
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

    public StudentSchool(StudentSchool.Builder builder) {
        this.schoolName = builder.schoolName;
        this.area = builder.area;
        this.province = builder.province;
        this.yearMatric = builder.yearMatric;
    }

    public static class Builder {
        private String schoolName;
        private String area;
        private String province;
        private String yearMatric;


        public StudentSchool.Builder schoolName(String value) {
            this.schoolName = value;
            return this;
        }

        public StudentSchool.Builder area(String value) {
            this.area = value;
            return this;
        }

        public StudentSchool.Builder province(String value) {
            this.province = value;
            return this;
        }

        public StudentSchool.Builder yearMatric(String value) {
            this.yearMatric = value;
            return this;
        }

        public StudentSchool build() {
            return new StudentSchool(this);
        }


    }
}
