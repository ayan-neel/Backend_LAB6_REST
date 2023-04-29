package com.gl.debate.service;

import com.gl.debate.entity.Student;
import com.gl.debate.model.StudentRequest;

import java.util.List;

public interface StudentService {
     List<Student> listAllStudents();
     Student getStudentById(long id);

     Student saveStudent(StudentRequest request);

     Student editStudent(StudentRequest request);

     void deleteStudent(long id);

}
