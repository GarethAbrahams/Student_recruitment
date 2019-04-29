package com.garethabrahams.model.Staff;

public class StaffEmail {
    private String email;

    public StaffEmail() {
    }

    public String getEmail() {
        return email;
    }

    public StaffEmail(StaffEmail.Builder builder){
        this.email = builder.email;
    }

    public static class Builder {

        private String email;

        public StaffEmail.Builder email(String value){
            this.email = value;
            return this;
        }

        public StaffEmail build(){
            return new StaffEmail(this);
        }
    }
}
