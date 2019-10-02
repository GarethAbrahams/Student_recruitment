package com.garethabrahams.service;

import com.garethabrahams.model.Applicant;

import java.util.List;
import java.util.Set;

public interface ApplicantService extends IService<Applicant, String> {
    Applicant findByItem(String itemdesc);
    List<Applicant> getAll();
}
