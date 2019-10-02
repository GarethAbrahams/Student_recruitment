package com.garethabrahams.service;

import com.garethabrahams.model.Qualification;

import java.util.Set;

public interface QualificationService extends IService<Qualification, String> {

    Set<Qualification> getAll();
}
