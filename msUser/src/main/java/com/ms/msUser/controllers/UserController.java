package com.ms.msUser.controllers;

import com.ms.msUser.dtos.UserRecordDTO;
import com.ms.msUser.dtos.mappers.UserMapper;
import com.ms.msUser.models.UserModel;
import com.ms.msUser.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ms/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;

    @PostMapping("/save")
    public ResponseEntity<UserModel> saveUser(@RequestBody @Valid UserRecordDTO userRecordDTO){
        UserModel userModel = userMapper.toModel(userRecordDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userModel));
    }
}
