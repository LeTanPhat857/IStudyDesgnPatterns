package com.ltphat.selfstudy.designpattern.builder;

import java.time.LocalDate;

public interface StudentBuilder {
    public StudentBuilderImpl setId(String id);

    public StudentBuilderImpl setName(String name);

    public StudentBuilderImpl setBirthDay(LocalDate birthday);

    public StudentBuilderImpl setGender(Gender gender);

    public StudentBuilderImpl setAddress(Address address);

    public Student build();
}
