package com.garethabrahams.model.Staff;

public class StaffRole {

    String roleType;

    private StaffRole() {
    }

    public String getRoleType(){
        return roleType;
    }

    public StaffRole (Builder builder) {
        this.roleType = builder.roleType;

    }

    public static class Builder {
        private String roleType;

        public StaffRole.Builder role(String value) {
            this.roleType = value;
            return this;
        }

        public StaffRole build() {
            return new StaffRole(this);
        }
    }
}
