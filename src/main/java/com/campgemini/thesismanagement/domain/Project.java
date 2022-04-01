package com.campgemini.thesismanagement.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_project")
    private Integer idProject;

    @OneToOne(mappedBy = "project")
    private Student student;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_teacher")
    @JsonIgnore
    private Teacher teacher;

    @Column(nullable = false)
    private String projectTitle;

    @NotEmpty
    private String projectDescription;

    private Boolean projectAvailability;
}
