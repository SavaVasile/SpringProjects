package com.springProject.spring.repositories;

import com.springProject.spring.model.DefaultModel;

@org.springframework.stereotype.Repository
public interface Repository <T extends DefaultModel>  {
    T  findById(int id);
    void  create(T object);
    void  delete(T object);
    void  modify(T object);
}
