package com.faith.springboot.repo;

import org.springframework.data.repository.CrudRepository;

import com.faith.springboot.entity.Request;

public interface IRequestRepo extends CrudRepository<Request, Integer> {

}