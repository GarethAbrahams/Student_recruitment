package com.garethabrahams.service;

import com.garethabrahams.model.Qualification;

import java.util.List;
import java.util.Set;

public interface QualificationService extends IService<Qualification, String> {

    Qualification findByItem(String itemdesc);

    List<Qualification> getAll();
}
