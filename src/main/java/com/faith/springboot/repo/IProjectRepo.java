package com.faith.springboot.repo;

import org.springframework.data.repository.CrudRepository;

import com.faith.springboot.entity.Project;

public interface IProjectRepo extends CrudRepository<Project, Integer> {

}

