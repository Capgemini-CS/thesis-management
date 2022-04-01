package com.campgemini.thesismanagement.domain.dto;

import com.campgemini.thesismanagement.domain.Student;
import com.campgemini.thesismanagement.domain.Teacher;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDto {

    private Integer idProject;

    private Student student;

    @JsonIgnore
    private Teacher teacher;

    private Integer idTeacher; // !!!

    private String projectTitle;

    private String projectDescription;

    private Boolean projectAvailability;




}
