package com.campgemini.thesismanagement.controller;

import com.campgemini.thesismanagement.domain.dto.ProjectDto;
import com.campgemini.thesismanagement.domain.dto.TeacherDto;
import com.campgemini.thesismanagement.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private final TeacherService teacherService;


    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<TeacherDto>> getAllTeachers() {
        return new ResponseEntity<>(teacherService.findAllTeachers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TeacherDto> getTeacherById(@PathVariable int id) {
        return new ResponseEntity<>(teacherService.findTeacherById(id), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<TeacherDto> saveTeacher(TeacherDto teacherDto){
        return new ResponseEntity<>(teacherService.addTeacher(teacherDto), HttpStatus.CREATED);
    }



}
