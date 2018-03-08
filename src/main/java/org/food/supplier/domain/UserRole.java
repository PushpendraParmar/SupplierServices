package org.food.supplier.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.core.Response.StatusType;

@Entity
@Table(name = "userRole")
public class UserRole {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "role_id")
	private int roleId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name ="role")
	private String role;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "delete_yn", columnDefinition ="java.lang.Char", length = 1)
	private String status;
	
	public void setRoleId(int id){
		this.roleId = id;		
	}
	
	public int getRoleId(){
		return roleId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public String getRole() {
		return role;		
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public String getDescription(){
		return description;		
	}
		
}