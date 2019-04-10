package com.garethabrahams.model;

public class SupportStaff {

    private String name, surname, empID, email, cellphone, campus;

    private SupportStaff() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmpID() {
        return empID;
    }

    public String getEmail() {
        return email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public String getCampus() {
        return campus;
    }

    public SupportStaff(SupportStaff.Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.empID = builder.empID;
        this.email = builder.email;
        this.cellphone = builder.cellphone;
        this.campus = builder.campus;
    }

    public static class Builder {
        private String name;
        private String surname;
        private String empID;
        private String email;
        private String cellphone;
        private String campus;

        public SupportStaff.Builder name(String value) {
            this.name = value;
            return this;
        }

        public SupportStaff.Builder surname(String value) {
            this.surname = value;
            return this;
        }

        public SupportStaff.Builder empID(String value) {
            this.empID = value;
            return this;
        }

        public SupportStaff.Builder email(String value) {
            this.email = value;
            return this;
        }

        public SupportStaff.Builder cellphone(String value) {
            this.cellphone = value;
            return this;
        }

        public SupportStaff.Builder campus(String value) {
            this.campus = value;
            return this;
        }


        public SupportStaff build() {
            return new SupportStaff(this);
        }
    }
}
