package com.garethabrahams.factory.General;

import com.garethabrahams.model.General.Facalty;

public class FacaltyFactory {

    public static Facalty createFacalty(String facalty){
        return new Facalty.Builder()
                .facaltyName(facalty)
                .build();
    }
}
