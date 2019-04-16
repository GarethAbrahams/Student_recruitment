package com.garethabrahams.model.Staff;

public class Administrator {

    private String name, surname, empID;

    private Administrator(){
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

    public Administrator(Administrator.Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.empID = builder.empID;
    }

    public static class Builder {
        private String name;
        private String surname;
        private String empID;

        public Administrator.Builder name(String value) {
            this.name = value;
            return this;
        }

        public Administrator.Builder surname(String value) {
            this.surname = value;
            return this;
        }

        public Administrator.Builder empID(String value) {
            this.empID = value;
            return this;
        }


        public Administrator build() {
            return new Administrator(this);
        }
    }
}
