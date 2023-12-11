package com.ruswanda.registerandlogin.repository;

import com.ruswanda.registerandlogin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

    User findByEmail(String email);
}
