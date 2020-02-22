package com.springProject.spring.repositories;

import com.springProject.spring.model.School;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SchoolRepository extends CrudRepository<School, Long> {
    List<School> findByName(String name);
    List<School> findByAddressAndName(String address, String name);

}

