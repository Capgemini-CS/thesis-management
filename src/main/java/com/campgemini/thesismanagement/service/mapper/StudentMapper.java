package com.campgemini.thesismanagement.service.mapper;

import com.campgemini.thesismanagement.domain.Student;
import com.campgemini.thesismanagement.domain.dto.StudentDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentMapper {

    public static StudentDto studentToStudentDto (Student student){
        StudentDto studentDTO = new StudentDto();
        studentDTO.setIdStudent(student.getIdStudent());
        studentDTO.setFirstName(student.getFirstName());
        studentDTO.setLastName(student.getLastName());
        studentDTO.setEmail(student.getEmail());
        studentDTO.setCNP(student.getCNP());
        studentDTO.setProject(student.getProject());
        return studentDTO;
    }

    public static Student studentDtoToStudent(StudentDto studentDto){
        Student student = new Student();
        student.setIdStudent(studentDto.getIdStudent());
        student.setFirstName(studentDto.getFirstName());
        student.setLastName(studentDto.getLastName());
        student.setEmail(studentDto.getEmail());
        student.setCNP(studentDto.getCNP());
        student.setProject(studentDto.getProject());
        return student;
    }
}

