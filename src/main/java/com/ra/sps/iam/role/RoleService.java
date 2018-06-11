package com.ra.sps.iam.role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
	
	@Autowired
	private RoleRepository roleRepository;

	public List<Role> findAll() {
		return (List<Role>) roleRepository.findAll();
	}

	public Role findById(Long roleId) {
		return roleRepository.findById(roleId).orElse(null);
	}

}
