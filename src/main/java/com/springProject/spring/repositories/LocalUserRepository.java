package com.springProject.spring.repositories;

import com.springProject.spring.model.LocalUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocalUserRepository extends CrudRepository<LocalUser,Long> {
    Optional<LocalUser> findByEmailIgnoreCase (String email);

}
