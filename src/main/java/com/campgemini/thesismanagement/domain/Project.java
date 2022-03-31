package com.campgemini.thesismanagement.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_project")
    private Integer idProject;

    @OneToOne(mappedBy = "project")
    private Student student;

    @ManyToOne(fetch = FetchType.EAGER)
    private Teacher teacher;

    private String projectTitle;

    private String projectDescription;

    private Boolean projectAvailability;
}
