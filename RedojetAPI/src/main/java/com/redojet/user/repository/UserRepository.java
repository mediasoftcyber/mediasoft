package com.redojet.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.redojet.user.model.User;

public interface UserRepository extends MongoRepository<User, String> {

}
