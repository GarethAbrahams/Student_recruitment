package com.garethabrahams.model;

public class Department {

    String department;

    private Department() {
    }

    public String getDepartment() {
        return department;
    }

    public Department (Builder builder) {
        this.department = builder.department;

    }

    public static class Builder {
        private String department;

        public Department.Builder department(String value) {
            this.department = value;
            return this;
        }

        public Department.Builder copy(Department dept){
            this.department = dept.department;
            return this;
        }

        public Department build() {
            return new Department(this);
        }
    }
}
