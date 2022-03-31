package com.campgemini.thesismanagement.controller;

import com.campgemini.thesismanagement.domain.dto.StudentDto;
import com.campgemini.thesismanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        return new ResponseEntity<>(studentService.findAllStudents(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable int id) {
        return new ResponseEntity<>(studentService.findStudentById(id), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<StudentDto> saveStudent(StudentDto studentDto){
        return new ResponseEntity<>(studentService.addStudent(studentDto), HttpStatus.CREATED);
    }
}