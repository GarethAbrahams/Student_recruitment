package com.garethabrahams.model.bridge;

public class ApplicantRole {

    private String applicantID, roleID;

    public ApplicantRole() {
    }

    public String getApplicantID() {
        return applicantID;
    }

    public String getRoleID() {
        return roleID;
    }

    public ApplicantRole (Builder builder){
        this.applicantID = builder.applicantID;
        this.roleID = builder.roleID;
    }

    public static class Builder {
        private String applicantID;
        private String roleID;

        public ApplicantRole.Builder applicantID(String value){
            this.applicantID = value;
            return this;
        }

        public ApplicantRole.Builder roleID(String value){
            this.roleID = value;
            return this;
        }

        public ApplicantRole.Builder copy(ApplicantRole applicantRole){
            this.applicantID = applicantRole.applicantID;
            this.roleID = applicantRole.roleID;
            return this;
        }

        public ApplicantRole build(){
            return new ApplicantRole(this);
        }
    }
}
