package com.ra.sps.iam.entitlement;

public class EntitlementDTO {
	private Long entityId;
	private String rolePermissionActionName;
	private String rolePermissionResourceName;
	
	public Long getEntityId() {
		return entityId;
	}
	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}
	public String getRolePermissionActionName() {
		return rolePermissionActionName;
	}
	public void setRolePermissionActionName(String rolePermissionActionName) {
		this.rolePermissionActionName = rolePermissionActionName;
	}
	public String getRolePermissionResourceName() {
		return rolePermissionResourceName;
	}
	public void setRolePermissionResourceName(String rolePermissionResourceName) {
		this.rolePermissionResourceName = rolePermissionResourceName;
	}
	
	
}
