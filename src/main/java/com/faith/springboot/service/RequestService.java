package com.faith.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.faith.springboot.entity.Request;
import com.faith.springboot.repo.IRequestRepo;



@Service
public class RequestService implements IRequestService {

	@Autowired
	private IRequestRepo requestRepo;

	@Override
	public List<Request> findAllRequests() {
		return (List<Request>) requestRepo.findAll();
	}

	@Transactional
	@Override
	public Request insertRequest(Request employee) {
		return requestRepo.save(employee);
	}
	
	@Transactional
	@Override
	public Request updateRequest(Request employee) {
		return requestRepo.save(employee);
	}
}
