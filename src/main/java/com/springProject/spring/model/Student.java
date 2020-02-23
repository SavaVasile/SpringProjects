package com.springProject.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.*;
import java.util.Objects;

@Entity
public class Student extends DefaultModel {

    @Column
    @NotBlank(message = "Name is mandatory")
    private String name;

    @Column
    @NotNull
    @Size(min = 13,max = 13, message = "CNP must be 13 digits")
    @Digits(integer = 13,fraction = 0, message = "CNP must be 13 digits")
    private String cnp;
    @Column
    @NotNull(message = "Gender required")
    private String gender;

    @Column
    @NotNull
    @Min(value = 1,message = "Age must be at least 1")
    @Max(value = 130,message = "Age must be lower then 130")
    private int age;
    @Column
    @NotNull(message = "Email required")
    @Email(message = "Email must be valid")
    private String email;

    private Student(Builder builder) {
        this.name = builder.name;
        this.cnp = builder.cnp;
        this.gender = builder.gender;
        this.age = builder.age;
        this.email = builder.email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        private String email;
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
        public Builder email(String email) {
            this.email = email;
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
