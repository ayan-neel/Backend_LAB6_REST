package com.gl.debate.model;

import lombok.Data;

@Data
public class StudentRequest {

    private long id;
    private String firstName;
    private String lastName;
    private String course;
    private String country;

}
