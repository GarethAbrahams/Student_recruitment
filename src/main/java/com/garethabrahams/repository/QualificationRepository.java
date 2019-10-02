package com.garethabrahams.repository;
import com.garethabrahams.model.Qualification;

import java.util.Set;

public interface QualificationRepository extends IRepository <Qualification, String> {
    Set<Qualification> getAll();
}
