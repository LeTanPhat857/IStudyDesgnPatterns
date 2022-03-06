package com.ltphat.selfstudy.designpattern.builder;

import java.time.LocalDate;

public class StudentBuilderImpl implements StudentBuilder {

    private Student student;

    public StudentBuilderImpl(String id, String name) {
        this.student = new Student();
        this.student.setId(id);
        this.student.setName(name);
    }

    @Override
    public StudentBuilderImpl setId(String id) {
        this.student.setId(id);
        return this;
    }

    @Override
    public StudentBuilderImpl setName(String name) {
        this.student.setName(name);
        return this;
    }

    @Override
    public StudentBuilderImpl setBirthDay(LocalDate birthday) {
        this.student.setBirthDate(birthday);
        return this;
    }

    @Override
    public StudentBuilderImpl setGender(Gender gender) {
        this.student.setGender(gender);
        return this;
    }

    @Override
    public StudentBuilderImpl setAddress(Address address) {
        this.student.setAddress(address);
        return this;
    }

    @Override
    public Student build() {
        return this.student;
    }
}
