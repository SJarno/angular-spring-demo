package com.jarno.angulardemo.repositories;

import com.jarno.angulardemo.models.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
    
}
