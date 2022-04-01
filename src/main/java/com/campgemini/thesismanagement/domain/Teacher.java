package com.campgemini.thesismanagement.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_teacher")
    private Integer idTeacher;

    private String firstName;

    private String lastName;

    private String email;

    private String CNP;

    private Integer numberOfStudents;

    @OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY)
   // @JoinColumn(name = "id_project")
    @JsonIgnore
    private List<Project> projectsList;
}
