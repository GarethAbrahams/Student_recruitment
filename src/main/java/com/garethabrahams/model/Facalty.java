package com.garethabrahams.model;

public class Facalty {

    String facaltyName;

    private Facalty(){
    }

    public String getFacaltyName(){
        return facaltyName;
    }

    public Facalty (Builder builder) {
        this.facaltyName = builder.facaltyName;

    }

    public static class Builder {
        private String facaltyName;

        public Facalty.Builder facaltyName(String value) {
            this.facaltyName = value;
            return this;
        }

        public Facalty.Builder copy(Facalty facalty){
            this.facaltyName = facalty.facaltyName;
            return this;
        }

        public Facalty build() {
            return new Facalty(this);
        }
        }
}
