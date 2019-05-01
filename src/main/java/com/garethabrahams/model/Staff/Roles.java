package com.garethabrahams.model.Staff;

public class Roles{

    private String roles;

    String role;

    public Roles() {
    }

    public String getRole(){
        return role;
    }

    public Roles (Builder builder){
        this.role = builder.role;
    }

    public static class Builder {
        private String role;

        public Roles.Builder role(String value){
            this.role = value;
            return this;
        }

        public Roles.Builder copy(Roles role){
            this.role = role.role;
            return this;
        }

        public Roles build(){
            return new Roles(this);
        }
    }
}
