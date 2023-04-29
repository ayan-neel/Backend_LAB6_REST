package com.gl.debate.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String country;

    @Column
    private String course;


}
