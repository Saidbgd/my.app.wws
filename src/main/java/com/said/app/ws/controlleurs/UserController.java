package com.said.app.ws.controlleurs;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.said.app.ws.requests.UserRequest;
import com.said.app.ws.responses.UserResponse;
import com.said.app.ws.services.UserService;
import com.said.app.ws.shared.UserDto;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;

	@GetMapping
	public String getUser() {
		return "get user are called ";
	}

	@PostMapping
	public UserResponse createUser(@RequestBody UserRequest userRequest) {
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userRequest, userDto);
		UserDto createdDto = userService.createUser(userDto);
		return null;
	}

	@PutMapping
	public String updateUser() {
		return "update user are called ";
	}

	@DeleteMapping
	public String deleteUser() {
		return "delete user are called";
	}

}
