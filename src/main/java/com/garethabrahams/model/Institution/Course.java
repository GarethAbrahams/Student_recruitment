package com.garethabrahams.model.Institution;

public class Course {
    private String courseName;
    private Facalty facalty;
    private Institution institution;

    public String getCourseName() {
        return courseName;
    }

    public String getFacalty(){ return facalty.getFacaltyName();}

    public String getInstitution(){ return institution.getInstitutionName();}

    public String getInstitutionCity(){ return institution.getInstitutionCity();}

    public Course(Course.Builder builder) {
        this.courseName = builder.courseName;
        this.facalty = builder.facalty;
        this.institution = builder.institution;
    }

    public static class Builder {
        private String courseName;
        private Facalty facalty;
        private Institution institution;

        public Course.Builder courseName(String value) {
            this.courseName = value;
            return this;
        }


        public Course.Builder facalty(Facalty value){
            this.facalty = value;
            return this;
        }

        public Course.Builder institution(Institution value){
            this.institution = value;
            return this;
        }

        public Course.Builder copy(Course course){
            this.courseName = course.courseName;
            this.facalty = course.facalty;
            this.institution = course.institution;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}
