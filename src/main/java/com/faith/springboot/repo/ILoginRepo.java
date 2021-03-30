package com.faith.springboot.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.faith.springboot.entity.Login;

public interface ILoginRepo extends CrudRepository<Login, Integer> {

	@Query("from Login where username=?1 and password=?2")
	public Login findByUsernameAndPassword(String username, String password);
}
