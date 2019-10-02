package com.garethabrahams.service.bridge;

import com.garethabrahams.model.bridge.ApplicantEmail;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface ApplicantEmailService extends IService<ApplicantEmail, String> {

    Set<ApplicantEmail> getAll();
}
