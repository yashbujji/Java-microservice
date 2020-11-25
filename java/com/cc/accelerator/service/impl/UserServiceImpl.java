package com.cc.accelerator.service.impl;

import static com.cc.accelerator.util.ConvertUtil.convertDtoToEntity;
import static com.cc.accelerator.util.ConvertUtil.convertEntityToDto;
import static com.cc.accelerator.util.ConvertUtil.getGenericResponse;
import static java.lang.ThreadLocal.withInitial;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.accelerator.dto.GenericResponse;
import com.cc.accelerator.dto.LoggingDto;
import com.cc.accelerator.dto.UserDto;
import com.cc.accelerator.entity.User;
import com.cc.accelerator.exception.ExceptionCode;
import com.cc.accelerator.exception.UserException;
import com.cc.accelerator.logging.EntryExitLogger;
import com.cc.accelerator.logging.LoggingUtil;
//import com.cc.accelerator.repository.MongoCollectionRepository;
import com.cc.accelerator.repository.UserRepository;
import com.cc.accelerator.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {
	private ThreadLocal<LoggingDto> customLogging = withInitial(LoggingDto::new);

	private final UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	//@Autowired
	//MongoCollectionRepository mongoCollectionRepository;

	@Override
	@EntryExitLogger
	public GenericResponse addUser(UserDto dto) throws InstantiationException, IllegalAccessException {
		customLogging.set(LoggingUtil.createLoggingDto(dto));
		//User obj = (User) userRepository.createEntity(dto, User::new);
		return getGenericResponse(userRepository.save(convertDtoToEntity(dto)));
	}

	@Override
	@EntryExitLogger
	public GenericResponse getUserV1_0(Long id) {
		customLogging.set(LoggingUtil.createLoggingDto("PassObjectForLogging"));
		if (id==null || id.equals("")) {
			log.info("custom Logging :  {}", customLogging.get());
			customLogging.remove();
			throw new UserException(ExceptionCode.ID_NOT_VALID);
		}else {
			log.info("custom Logging :  {}", customLogging.get());
			customLogging.remove();
			Optional<User> user = userRepository.findById(id);
			if(!user.isPresent())
				throw new UserException(ExceptionCode.ID_NOT_VALID);
			return getGenericResponse(user.get().getFirstName());
		}
	
	}
	@Override
	@EntryExitLogger
	public GenericResponse getUserV1_1(Long id) {
		customLogging.set(LoggingUtil.createLoggingDto("PassObjectForLogging"));
		if (id==null || id.equals("")) {
			log.info("custom Logging :  {}", customLogging.get());
			customLogging.remove();
			throw new UserException(ExceptionCode.ID_NOT_VALID);
		}else {
			log.info("custom Logging :  {}", customLogging.get());
			customLogging.remove();
			Optional<User> user = userRepository.findById(id);
			if(!user.isPresent())
				throw new UserException(ExceptionCode.ID_NOT_VALID);
			return getGenericResponse(user.get());
		}
	
	}
}
