package com.campgemini.thesismanagement.service;

import com.campgemini.thesismanagement.domain.Project;
import com.campgemini.thesismanagement.domain.dto.ProjectDto;
import com.campgemini.thesismanagement.repository.ProjectRepository;
import com.campgemini.thesismanagement.service.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectService {

    @Autowired
    private final ProjectRepository projectRepository;


    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<ProjectDto> findAllProjects(){
        return projectRepository.findAll()
                .stream()
                .map(ProjectMapper::projectToProjectDto)
                .collect(Collectors.toList());
    }

    public ProjectDto findProjectById(int id){
        return ProjectMapper.projectToProjectDto(projectRepository.getById(id));
    }

    public ProjectDto addProject(ProjectDto projectDto){
        Project project = projectRepository.save(ProjectMapper.projectDtoToProject(projectDto));
        return ProjectMapper.projectToProjectDto(project);
    }


}
