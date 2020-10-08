package edu.eci.pdsw.entities;

import org.apache.ibatis.annotations.Param;

public class User {
	private String login;
	private String name;
	private String lastName;
	
	public User(@Param("login")  String login,@Param("name") String name,@Param("lastName") String lastName) {
		super();
		this.login = login;
		this.name = name;
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(@Param("login") String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(@Param("name") String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(@Param("lastName") String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		 return "User { login: "+login+", name: "+name+", lastName: "+lastName+" }";
	}

	

}
