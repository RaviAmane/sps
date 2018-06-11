package com.ra.sps.iam.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
