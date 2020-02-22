package com.springProject.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Student extends DefaultModel {

    @Column
    private String name;
    @Column
    private String cnp;
    @Column
    private String gender;
    @Column
    private int age;

    private Student(Builder builder) {
        this.name = builder.name;
        this.cnp = builder.cnp;
        this.gender = builder.gender;
        this.age = builder.age;
    }

    public static Builder newStudent() {
        return new Builder();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", cnp='" + cnp + '\'' +
                '}';
    }
    public static final class Builder {
        private String name;
        private String cnp;
        private String gender;
        private int age;



        public Student build() {
            return new Student(this);
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder cnp(String cnp) {
            this.cnp = cnp;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }
    }
}
