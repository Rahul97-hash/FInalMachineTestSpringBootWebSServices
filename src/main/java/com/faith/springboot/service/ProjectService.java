package com.faith.springboot.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.springboot.entity.Project;
import com.faith.springboot.repo.IProjectRepo;

@Service
public class ProjectService implements IProjectService {

	@Autowired
	private IProjectRepo projectRepo;

	@Override
	public List<Project> findAll() {
		return (List<Project>) projectRepo.findAll();
	}

}

