package com.redojet.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.redojet.user.model.AdminUser;

public interface AdminUserRepository extends MongoRepository<AdminUser, String> {

}
