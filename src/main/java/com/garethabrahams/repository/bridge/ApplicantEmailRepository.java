package com.garethabrahams.repository.bridge;

import com.garethabrahams.model.bridge.ApplicantContact;
import com.garethabrahams.model.bridge.ApplicantEmail;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface ApplicantEmailRepository extends IRepository <ApplicantEmail,String> {
    Set<ApplicantEmail> getAll();
}
