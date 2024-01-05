package com.pentagono.lvd.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class UserEntity {

	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Column(name="username", nullable=false, length = 50)
	private String username;
	@Column(name="userpass", nullable=false, length = 150)
	private String userpass;
	@Column(name="firstname", nullable=false, length = 50)
	private String firstname;
	@Column(name="lastname", nullable=false, length = 50)
	private String lastname;
	@Column(name="status", nullable=false, length = 50)
	private boolean status;
	@Column(name="rolid", nullable=false)
	private int rolid;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getRolid() {
		return rolid;
	}
	public void setRolid(int rolid) {
		this.rolid = rolid;
	}
	
	
}
