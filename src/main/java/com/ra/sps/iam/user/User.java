package com.ra.sps.iam.user;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ra.sps.iam.entitlement.Entitlement;

@Entity
@Table(name="\"User\"") // User is a reserved word in SQL - explicitly double quote the name!
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userId;
	
	@OneToMany
	@JoinTable(name="Entitlement", joinColumns=@JoinColumn(name="userId"), inverseJoinColumns=@JoinColumn(name="entitlementId"))
	List<Entitlement> entitlements;

	private String email;
	
	private String password;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public List<Entitlement> getEntitlements() {
		return entitlements;
	}

	public void setEntitlements(List<Entitlement> entitlements) {
		this.entitlements = entitlements;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
