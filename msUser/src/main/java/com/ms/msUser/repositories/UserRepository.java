package com.ms.msUser.repositories;

import com.ms.msUser.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository <UserModel, UUID> {

}
