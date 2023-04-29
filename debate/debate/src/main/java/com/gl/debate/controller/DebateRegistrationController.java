package com.gl.debate.controller;

import com.gl.debate.entity.Student;
import com.gl.debate.model.StudentRequest;
import com.gl.debate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/student")
@RestController
public class DebateRegistrationController {

    @Autowired
    StudentService studentService;

   @GetMapping("/list")
    public List<Student> getStudentList (){
        return studentService.listAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable long id){
       return studentService.getStudentById(id);
    }

    @PostMapping("/save")
    public Student saveStudent(@RequestBody StudentRequest request){
       return studentService.saveStudent(request);
    }

    @PutMapping("/edit")
    public Student editStudent(@RequestBody StudentRequest request){
       return studentService.editStudent(request);
    }
    @DeleteMapping("/{id}")
    public int deleteStudent(@PathVariable long id){
       studentService.deleteStudent(id);
       return 1;
    }



}
