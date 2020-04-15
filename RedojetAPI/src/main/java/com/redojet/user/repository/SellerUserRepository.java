package com.redojet.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.redojet.user.model.SellerUser;

public interface SellerUserRepository extends MongoRepository<SellerUser, String> {

}
