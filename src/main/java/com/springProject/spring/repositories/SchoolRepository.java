package com.springProject.spring.repositories;

import com.springProject.spring.model.School;

import java.util.List;

public interface SchoolRepository extends Repository<School> {
    @Override
    School findById(int id);

    List<School> findByName(String name);


}

