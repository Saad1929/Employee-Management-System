package com.saadbaig.fullstackbackend.repository;

import com.saadbaig.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
