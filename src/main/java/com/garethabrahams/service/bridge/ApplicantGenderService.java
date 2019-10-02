package com.garethabrahams.service.bridge;

import com.garethabrahams.model.bridge.ApplicantGender;
import com.garethabrahams.service.IService;

import java.util.List;
import java.util.Set;

public interface ApplicantGenderService extends IService<ApplicantGender, String> {

    List<ApplicantGender> getAll();
}
