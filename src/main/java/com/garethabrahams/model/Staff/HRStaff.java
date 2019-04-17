package com.garethabrahams.model.Staff;

public class HRStaff {

    private String name, surname, empID, email, cellphone, campus;

    private HRStaff() {
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

    public HRStaff(HRStaff.Builder builder) {
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

        public HRStaff.Builder name(String value) {
            this.name = value;
            return this;
        }

        public HRStaff.Builder surname(String value) {
            this.surname = value;
            return this;
        }

        public HRStaff.Builder empID(String value) {
            this.empID = value;
            return this;
        }

        public HRStaff.Builder email(String value) {
            this.email = value;
            return this;
        }

        public HRStaff.Builder cellphone(String value) {
            this.cellphone = value;
            return this;
        }

        public HRStaff.Builder campus(String value) {
            this.campus = value;
            return this;
        }


        public HRStaff build() {
            return new HRStaff(this);
        }
    }
}
