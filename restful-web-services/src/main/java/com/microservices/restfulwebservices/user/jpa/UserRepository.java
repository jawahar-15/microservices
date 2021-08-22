package com.microservices.restfulwebservices.user.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.restfulwebservices.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
