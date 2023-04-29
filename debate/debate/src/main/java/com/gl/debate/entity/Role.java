package com.gl.debate.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Role {
    @Id
    private int id;
    @Column
    private String name;


}
