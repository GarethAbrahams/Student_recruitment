package com.garethabrahams.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Outcome {

    @Id
    private String id;
    private String result;

    public Outcome() {
    }

    public String getId() {
        return id;
    }

    public String getResult() {
        return result;
    }

    public Outcome(Builder builder) {
        this.id = builder.id;
        this.result = builder.result;
    }

    public static class Builder {
        private String id;
        private String result;

        public Builder id(String value){
            this.id = value;
            return this;
        }

        public Builder result(String value) {
            this.result = value;
            return this;
        }


        public Builder copy(Outcome outcome){
            this.id = outcome.id;
            this.result = outcome.result;
            return this;
        }

        public Outcome build() {
            return new Outcome(this);
        }
    }
}
