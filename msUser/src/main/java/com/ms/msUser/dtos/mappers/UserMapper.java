package com.ms.msUser.dtos.mappers;

import com.ms.msUser.dtos.UserRecordDTO;
import com.ms.msUser.models.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserModel toModel(UserRecordDTO dto) {
        UserModel userModel = new UserModel();
        userModel.setName(dto.name());
        userModel.setEmail(dto.email());
        return userModel;
    }
}