package com.springProject.spring.repositories.impl;

import com.springProject.spring.model.School;
import com.springProject.spring.model.Student;
import org.springframework.stereotype.Repository;
import com.springProject.spring.repositories.SchoolRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DefaultSchoolRepository extends DefaultRepository<School> implements SchoolRepository {


    public List<School> findByName(String name) {
        return entityList.stream()
                .filter((s) -> s.getName() == name)
                .collect(Collectors.toList());
    }

}
