package com.garethabrahams.factory.Institution;

import com.garethabrahams.model.Institution.Facalty;

public class FacaltyFactory {

    public static Facalty createFacalty(String facalty){
        return new Facalty.Builder()
                .facaltyName(facalty)
                .build();
    }
}
