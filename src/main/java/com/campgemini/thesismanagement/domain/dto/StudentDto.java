package com.campgemini.thesismanagement.domain.dto;

import com.campgemini.thesismanagement.domain.Project;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private Integer idStudent;
    private String firstName;
    private String lastName;
    private String email;
    private String CNP;
    @JsonIgnore
    private Project project;
    private Integer idProject; //

}
