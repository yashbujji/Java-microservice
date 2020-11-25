package com.cc.accelerator.service;

import com.cc.accelerator.dto.GenericResponse;
import com.cc.accelerator.dto.UserDto;

public interface UserService {
	GenericResponse addUser(UserDto dto) throws InstantiationException, IllegalAccessException;
	GenericResponse getUserV1_0(Long id);
	GenericResponse getUserV1_1(Long id);
}
