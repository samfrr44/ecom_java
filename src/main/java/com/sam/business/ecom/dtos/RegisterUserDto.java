package com.sam.business.ecom.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)

public class RegisterUserDto {
    private String email;

    private String password;

    private String fullName;

}
