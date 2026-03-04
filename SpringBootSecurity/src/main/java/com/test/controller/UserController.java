package com.test.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableMethodSecurity
public class UserController {
	@GetMapping("/")
	//@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String homepage() {
		return "index";
	}
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	@GetMapping("/user/read")
	@ResponseBody
	@PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
	public String userPage() {
		return "USER AND ADMIN CAN READ THE DATA";
	}
	@GetMapping("/delete")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String adminPage() {
		return "ONLY ADMIN CAN DELETE THE DATA";
	}
	@GetMapping("/update")
	@ResponseBody
	@PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_HR')")
	public String updateUsers() {
		return "DETAILS UPDATED WITH ADMIN ROLE";
	}
	@GetMapping("/user/hr/onboard")
	@ResponseBody
	@PreAuthorize("hasAnyRole('ROLE_HR','ROLE_EMPLOYEE','ROLE_ADMIN')")
	public String updateHR() {
		return "ONBOARDED EMPLOYEE WITH HR ROLE";
	}
	
	
	
	
}
