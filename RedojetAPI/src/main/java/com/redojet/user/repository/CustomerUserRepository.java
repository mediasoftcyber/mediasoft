package com.redojet.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.redojet.user.model.CustomerUser;

public interface CustomerUserRepository extends MongoRepository<CustomerUser, String> {

}
