package com.garethabrahams.model.Institution;

public class Institution {

    String institutionName, institutionLocation;

    private Institution(){
    }

    public String getInstitutionName(){
        return institutionName;
    }

    public String getLocation(){
        return institutionLocation;
    }

    public Institution (Builder builder) {
        this.institutionName = builder.institutionName;
        this.institutionLocation = builder.institutionLocation;

    }

    public static class Builder {
        private String institutionName,institutionLocation;

        public Institution.Builder institutionName(String value) {
            this.institutionName = value;
            return this;
        }

        public Institution.Builder institutionLocation(String value) {
            this.institutionLocation = value;
            return this;
        }

        public Institution build() {
            return new Institution(this);
        }


    }
}
