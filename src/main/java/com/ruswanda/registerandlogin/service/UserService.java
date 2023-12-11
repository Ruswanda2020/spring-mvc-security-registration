package com.ruswanda.registerandlogin.service;

import com.ruswanda.registerandlogin.dto.UserDto;
import com.ruswanda.registerandlogin.entity.User;

public interface UserService {

    User save(UserDto dto);
}
