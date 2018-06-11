package com.ra.sps.iam.permission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionService {
	
	@Autowired
	private PermissionRepository permissionRepository;

	public Permission getPermission(Long permissionId) {
		return permissionRepository.findByPermissionId(permissionId);
	}

}
