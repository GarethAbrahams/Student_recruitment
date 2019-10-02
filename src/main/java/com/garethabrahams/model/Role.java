package com.garethabrahams.model;

public class Role {

    private String roleID;
    String role;

    public Role() {
    }

    public String getRoleID(){
        return roleID;
    }

    public String getRole(){
        return role;
    }

    public Role (Builder builder){
        this.roleID = builder.roleID;
        this.role = builder.role;
    }

    public static class Builder {
        private String roleID;
        private String role;

        public Role.Builder roleID(String value){
            this.roleID = value;
            return this;
        }

        public Role.Builder role(String value){
            this.role = value;
            return this;
        }

        public Role.Builder copy(Role role){
            this.roleID = role.roleID;
            this.role = role.role;
            return this;
        }

        public Role build(){
            return new Role(this);
        }
    }
}
