package com.garethabrahams.model.Staff;

import com.garethabrahams.model.General.Department;
import com.garethabrahams.model.General.Roles;

public class Staff {

    private String employeeID, name, surname, id;
    private StaffAddress address;
    private StaffContact contact;
    private StaffEmail email;
    private Department department;
    private Roles role;

    public Staff() {
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getId() {
        return id;
    }

    public StaffAddress getAddress() {
        return address;
    }

    public StaffContact getContact() {
        return contact;
    }

    public StaffEmail getEmail() {
        return email;
    }

    public Department getDepartment() {
        return department;
    }

    public Roles getRole(){
        return role;
    }

    public Staff(Builder builder){
        this.employeeID = builder.employeeID;
        this.name = builder.name;
        this.surname = builder.surname;
        this.id = builder.id;
        this.address = builder.address;
        this.contact = builder.contact;
        this.email = builder.email;
        this.department = builder.department;
        this.role = builder.role;
    }

    public static class Builder {
        private String employeeID, name, surname, id;
        private StaffAddress address;
        private StaffContact contact;
        private StaffEmail email;
        private Department department;
        private Roles role;

        public Builder employeeID(String value){
            this.employeeID = value;
            return this;
        }

        public Builder name(String value){
            this.name = value;
            return this;
        }

        public Builder surname(String value){
            this.surname = value;
            return this;
        }

        public Builder id(String value){
            this.id = value;
            return this;
        }

        public Builder address(StaffAddress value){
            this.address = value;
            return this;
        }

        public Builder contact(StaffContact value){
            this.contact = value;
            return this;
        }

        public Builder email(StaffEmail value){
            this.email = value;
            return this;
        }

        public Builder department(Department value){
            this.department = value;
            return this;
        }

        public Builder role(Roles value){
            this.role = value;
            return this;
        }

        public Builder copy(Staff staff){
            this.employeeID = staff.employeeID;
            this.name = staff.name;
            this.surname = staff.surname;
            this.id = staff.id;
            this.address = staff.address;
            this.contact = staff.contact;
            this.email = staff.email;
            this.department = staff.department;
            this.role = staff.role;
            return this;
        }

        public Staff build(){
            return new Staff(this);
        }
    }
}
