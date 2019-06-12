package com.garethabrahams.service.Applicant;

import com.garethabrahams.model.Applicant.ApplicantEmail;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface ApplicantEmailService extends IService<ApplicantEmail, String> {
    Set<ApplicantEmail> getAll();
}
