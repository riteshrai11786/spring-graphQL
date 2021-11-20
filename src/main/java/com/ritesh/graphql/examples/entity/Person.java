package com.ritesh.graphql.examples.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

/** Represents a Person entity.
 * @author Ritesh Rai
 * @version 1.0
 * @since 1.0
 */

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String[] addresses;
}
