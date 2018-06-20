package com.ra.sps.iam.user;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ra.sps.iam.entitlement.Entitlement;
import com.ra.sps.iam.permission.Permission;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return (List<User>) userRepository.findAll();
	}

	public User findById(Long userId) {
		return userRepository.findById(userId).orElse(null);
	}

	public List<String> getEntitlements(Long userId) {
		User user = findById(userId);
		if(user == null)
			return new ArrayList<>();
		List<Entitlement> entitlements = user.getEntitlements();
		return entitlements.stream().map(entitlement -> {
			String entity = entitlement.getEntity().getEntityId().toString();
			String claim = entity + ":" + getCommaSeperatedPermissions(entitlement.getRole().getPermissions());
			return claim;
		}).collect(Collectors.toList());
	}

	private String getCommaSeperatedPermissions(List<Permission> permissions) {
		List<String> claims = permissions.stream().map(permission -> {
			return permission.getResource().getName() + "|" + permission.getAction().getName();
		}).collect(Collectors.toList());
		return StringUtils.join(claims, ',');
	}
}
