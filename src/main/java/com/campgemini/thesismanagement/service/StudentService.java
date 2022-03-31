package com.campgemini.thesismanagement.service;

import com.campgemini.thesismanagement.domain.Student;
import com.campgemini.thesismanagement.domain.dto.StudentDto;
import com.campgemini.thesismanagement.repository.StudentRepository;
import com.campgemini.thesismanagement.service.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<StudentDto> findAllStudents() {
        return studentRepository.findAll()
                .stream()
                .map(StudentMapper::studentToStudentDto)
                .collect(Collectors.toList());
    }

    public StudentDto findStudentById(int id){
        return StudentMapper.studentToStudentDto(studentRepository.getById(id));
    }

    public StudentDto addStudent(StudentDto studentDto){
        Student student = studentRepository.save(StudentMapper.studentDtoToStudent(studentDto));
        return StudentMapper.studentToStudentDto(student);
    }



}
