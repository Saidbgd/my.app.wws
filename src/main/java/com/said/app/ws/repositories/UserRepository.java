package com.said.app.ws.repositories;

import org.springframework.data.repository.CrudRepository;

import com.said.app.ws.entities.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
