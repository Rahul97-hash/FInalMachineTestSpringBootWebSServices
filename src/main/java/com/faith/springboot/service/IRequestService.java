package com.faith.springboot.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.faith.springboot.entity.Request;


public interface IRequestService {

	List<Request> findAllRequests();

	Request insertRequest(Request employee);

	Request updateRequest(Request employee);


	

}
