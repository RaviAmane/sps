package com.ra.sps.iam.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	List<User> findAll() {
		return userService.findAll();
	}
	
	@GetMapping("{userId}")
	User findById(@PathVariable Long userId) {
		return userService.findById(userId);
	}

}
