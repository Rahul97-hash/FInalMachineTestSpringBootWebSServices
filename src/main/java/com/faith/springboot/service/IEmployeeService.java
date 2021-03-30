package com.faith.springboot.service;

import java.util.List;
import java.util.Optional;

import com.faith.springboot.entity.Employee;

public interface IEmployeeService {

	List<Employee> findAllEmployees();

	Optional<Employee> findById(int id);

	Employee insertEmployee(Employee employee);

	Employee updateEmployee(Employee employee);


}
