package com.cc.accelerator.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cc.accelerator.dto.GenericResponse;
import com.cc.accelerator.dto.UserDto;
import com.cc.accelerator.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {
	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/addUser")
	public ResponseEntity<GenericResponse> addUpdateCustomer(@RequestBody @Valid UserDto dto) throws InstantiationException, IllegalAccessException {
		return ResponseEntity.ok(userService.addUser(dto));
	}
	
	@GetMapping(value ="/getUser/{id}", params = "version=1.0")
	public ResponseEntity<GenericResponse> getUserV1_0(@PathVariable Long id) {
		return ResponseEntity.ok(userService.getUserV1_0(id));
	}
	
	@GetMapping(value ="/getUser/{id}", params = "version=1.1")
	public ResponseEntity<GenericResponse> getUser(@PathVariable Long id) {
		return ResponseEntity.ok(userService.getUserV1_1(id));
	}
	
}
