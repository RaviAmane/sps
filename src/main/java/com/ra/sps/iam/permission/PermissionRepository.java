package com.ra.sps.iam.permission;

import org.springframework.data.repository.CrudRepository;

public interface PermissionRepository extends CrudRepository<Permission, Long> {

	Permission findByPermissionId(Long permissionId);

}
