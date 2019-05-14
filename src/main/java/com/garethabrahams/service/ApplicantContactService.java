package com.garethabrahams.service;

import com.garethabrahams.model.ApplicantContact;

import java.util.Set;

public interface ApplicantContactService extends IService<ApplicantContact,String> {
    Set<ApplicantContact> getAll();
}
