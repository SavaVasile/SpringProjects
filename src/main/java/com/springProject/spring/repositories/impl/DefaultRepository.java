package com.springProject.spring.repositories.impl;


import com.springProject.spring.model.DefaultModel;
import com.springProject.spring.model.Student;
import com.springProject.spring.repositories.Repository;

import java.util.ArrayList;
import java.util.List;


public  class DefaultRepository<T extends DefaultModel>  implements Repository<T>  {
   protected List<T> entityList = new ArrayList<>();

    @Override
    public void create(T object) {
        entityList.add(object);
    }
    @Override
    public void delete(T object){
        entityList.remove(object);
    }
    @Override
    public void modify(T object) {
        delete(object);
        entityList.add(object);
    }
    @Override
    public  T findById(int id) {
        return entityList.stream()
                .filter((s) -> s.getId() == id)
                .findFirst().orElse(null);
    }
}
