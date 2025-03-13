package com.libcode.crud.crud.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libcode.crud.crud.user.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    
}
