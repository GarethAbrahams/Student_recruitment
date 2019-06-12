package com.garethabrahams.service.Applicant;

import com.garethabrahams.model.Applicant.ApplicantContact;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface ApplicantContactService extends IService<ApplicantContact,String> {
    Set<ApplicantContact> getAll();
}
