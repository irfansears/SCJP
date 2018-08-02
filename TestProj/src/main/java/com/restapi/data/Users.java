package com.restapi.data;

//pojo- plain old java object

public class Users {
	String name;
	String job;
	
	public Users(String name, String job)
	{
		this.name=name;
		this.job=job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Users() {
	}

}
