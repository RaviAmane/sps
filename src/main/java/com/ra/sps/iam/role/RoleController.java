package com.ra.sps.iam.role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("roles")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@GetMapping
	List<Role> getAll() {
		return roleService.findAll();
	}
	
	@GetMapping("{roleId}")
	Role get(@PathVariable Long roleId) {
		return roleService.findById(roleId);
	}

}
