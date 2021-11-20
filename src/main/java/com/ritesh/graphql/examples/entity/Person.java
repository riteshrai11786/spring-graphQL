package com.ritesh.graphql.examples.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Person {

    @Id
    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String[] addresses;
}
