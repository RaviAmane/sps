package com.ra.sps.iam.permission;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Permission {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long permissionId;
	
	@OneToOne
	@JoinColumn(name="resourceId")
	private Resource resource;
	
	@OneToOne
	@JoinColumn(name="actionId")
	private Action action;

	public Long getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}
}
