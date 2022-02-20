package com.ondeparei.OndeParei.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "User")

public class User {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idUser;
	
	@NotNull
	@Size(min = 5, max = 70)
	private String login;
	
	@NotNull
	@Size(min = 8,max =20)
	private String passwd;
	
	@NotNull
	@Size(min= 1, max = 20)
	private String name;

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	


}
