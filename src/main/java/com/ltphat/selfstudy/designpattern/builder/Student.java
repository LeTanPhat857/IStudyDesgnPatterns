package com.ltphat.selfstudy.designpattern.builder;

import lombok.*;

import java.time.LocalDate;

@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String id;
    private String name;
    private LocalDate birthDate;
    private Gender gender;
    private Address address;
}

