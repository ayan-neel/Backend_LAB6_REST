package com.gl.debate.service.impl;

import com.gl.debate.entity.Student;
import com.gl.debate.model.StudentRequest;
import com.gl.debate.repository.StudentRepository;
import com.gl.debate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> listAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student saveStudent(StudentRequest request) {
        Student student = new Student();
        student.setFirstName(request.getFirstName());
        student.setCourse(request.getCourse());
        student.setLastName(request.getLastName());
        student.setCountry(request.getCountry());
        return studentRepository.save(student);
    }

    @Override
    public Student editStudent(StudentRequest request) {

        Student student = studentRepository.findById(request.getId()).get();
        student.setFirstName(request.getFirstName());
        student.setCourse(request.getCourse());
        student.setLastName(request.getLastName());
        student.setCountry(request.getCountry());
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(long id) {
        studentRepository.deleteById(id);

    }
}
