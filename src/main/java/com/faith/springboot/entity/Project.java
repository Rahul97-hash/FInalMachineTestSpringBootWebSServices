package com.faith.springboot.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "projectId")
	private int projectId;
	
	@Column(name = "projectName")
	private String projectName;

	@JsonIgnore
	@OneToMany(mappedBy = "project")
	private List<Request> requests;

	//Default Constructor
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Parameterized Constructor
	public Project(int projectId, String projectName, List<Request> requests) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.requests = requests;
	}

	// Getters and setters
	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Request> getRequests() {
		return requests;
	}

	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}

}
