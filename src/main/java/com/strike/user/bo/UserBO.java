package com.strike.user.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.strike.user.repository.UserRepository;

@Service
public class UserBO {

	@Autowired
	private UserRepository userRepository;
}
