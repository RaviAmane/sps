package com.ra.sps.iam.entitlement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.ra.sps.iam.role.Role;

@Entity
public class Entitlement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long entitlementId;
	
	@OneToOne
	@JoinColumn(name="entityId")
	private com.ra.sps.iam.entity.Entity entity;
	
	@OneToOne
	@JoinColumn(name="roleId")
	private Role role;
	
	public Long getEntitlementId() {
		return entitlementId;
	}

	public void setEntitlementId(Long entitlementId) {
		this.entitlementId = entitlementId;
	}

	public com.ra.sps.iam.entity.Entity getEntity() {
		return entity;
	}

	public void setEntity(com.ra.sps.iam.entity.Entity entity) {
		this.entity = entity;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
