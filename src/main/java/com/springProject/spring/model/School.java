package com.springProject.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;
import java.util.Objects;
@Entity
public class School extends DefaultModel {
    @Column
    private String name;
    @Column
    private String address;


    public School (){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof School)) return false;
        School school = (School) o;
        return id == school.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "School {" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

