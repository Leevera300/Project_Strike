package com.strike.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/strike/user")
@Controller
public class UserController {

	@GetMapping("/sign-in")
	public String signIn() {
		return "user/signIn";
	}
	
	@GetMapping("/sign-up")
	public String signUp() {
		return "user/signUp";
	}
}
