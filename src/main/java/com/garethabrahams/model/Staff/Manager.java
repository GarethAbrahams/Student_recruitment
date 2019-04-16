package com.garethabrahams.model.Staff;

public class Manager {

    private String name, surname, empID, department;

    public Manager() {
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

    public String getDepartment() {
        return department;
    }

    public Manager(Manager.Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.empID = builder.empID;
        this.department = builder.department;
    }

    public static class Builder {
        private String name;
        private String surname;
        private String empID;
        private String department;

        public Manager.Builder name(String value) {
            this.name = value;
            return this;
        }

        public Manager.Builder surname(String value) {
            this.surname = value;
            return this;
        }

        public Manager.Builder empID(String value) {
            this.empID = value;
            return this;
        }

        public Manager.Builder department(String value) {
            this.department = value;
            return this;
        }

        public Manager build() {
            return new Manager(this);
        }
    }
}
