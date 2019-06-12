package com.garethabrahams.model.General;

import com.garethabrahams.model.Applicant.Applicant;
import com.garethabrahams.model.Staff.Staff;

public class Username {
    private String username;
    private Staff user;
    private Applicant applicant;
    private Password password;


    public Username() {
    }

    public String getUsername() {
        return username;
    }

    public String getStaffEmpNo(){
        return user.getEmployeeID();
    }

    public String getStaffFullName(){
        return user.getName()+" "+user.getSurname();
    }


    public Username(Builder builder) {
        this.username = builder.username;
        this.user = builder.user;
    }

    public static class Builder {
        private String username;
        private Staff user;

        public Username.Builder username(String value) {
            this.username = value;
            return this;
        }

        public Username.Builder user(Staff value){
            this.user = value;
            return this;
        }

        public Username.Builder copy(Username user){
            this.user = user.user;
            this.username = user.username;
            return this;
        }

        public Username build() {
            return new Username(this);
        }
    }
}

