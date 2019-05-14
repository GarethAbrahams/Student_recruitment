package com.garethabrahams.service;

import com.garethabrahams.model.ApplicantEmail;

import java.util.Set;

public interface ApplicantEmailService extends IService <ApplicantEmail, String> {
    Set<ApplicantEmail> getAll();
}
