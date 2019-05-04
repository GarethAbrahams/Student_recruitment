package com.garethabrahams.factory;

import com.garethabrahams.model.Facalty;

public class FacaltyFactory {

    public static Facalty createFacalty(String facalty){
        return new Facalty.Builder()
                .facaltyName(facalty)
                .build();
    }
}
