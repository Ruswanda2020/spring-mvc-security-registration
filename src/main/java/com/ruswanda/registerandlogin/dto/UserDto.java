package com.ruswanda.registerandlogin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {

    private String email;
    private String password;
    private String fullName;
}
