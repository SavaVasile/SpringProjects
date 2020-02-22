package com.springProject.spring.model;

import javax.persistence.*;

@MappedSuperclass
public abstract class DefaultModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
