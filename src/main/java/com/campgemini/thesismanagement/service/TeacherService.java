package com.campgemini.thesismanagement.service;

import com.campgemini.thesismanagement.domain.Teacher;
import com.campgemini.thesismanagement.domain.dto.TeacherDto;
import com.campgemini.thesismanagement.repository.TeacherRepository;
import com.campgemini.thesismanagement.service.mapper.TeacherMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeacherService {

    @Autowired
    private final TeacherRepository teacherRepository;


    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<TeacherDto> findAllTeachers(){
        return teacherRepository.findAll()
                .stream()
                .map(TeacherMapper::teacherToTeacherDto)
                .collect(Collectors.toList());
    }

    public TeacherDto findTeacherById(int id){
        return TeacherMapper.teacherToTeacherDto(teacherRepository.getById(id));
    }

    public TeacherDto addTeacher(TeacherDto teacherDto){
        Teacher teacher = teacherRepository.save(TeacherMapper.teacherDtoToTeacher(teacherDto));
        return TeacherMapper.teacherToTeacherDto(teacher);
    }
}
