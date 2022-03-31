package com.campgemini.thesismanagement.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_student")
    private Integer idStudent;

    private String firstName;

    private String lastName;

    private String email;

    private String CNP;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_project")
    private Project project;


}