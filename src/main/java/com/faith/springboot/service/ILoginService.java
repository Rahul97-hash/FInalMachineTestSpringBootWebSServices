package com.faith.springboot.service;

import java.util.List;

import com.faith.springboot.entity.Login;

public interface ILoginService {

	List<Login> findAll();

	Login insertUser(Login login);

	Login updateUser(Login login);

	Login findUserByNameAndPassword(String username, String password);

}
