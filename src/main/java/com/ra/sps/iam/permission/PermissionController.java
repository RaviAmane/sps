package com.ra.sps.iam.permission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("permissions")
public class PermissionController {
	
	@Autowired
	private PermissionService permissionService;

	@GetMapping("{permissionId}")
	Permission getPermission(@PathVariable Long permissionId) {
		return permissionService.getPermission(permissionId);
	}
	
}
