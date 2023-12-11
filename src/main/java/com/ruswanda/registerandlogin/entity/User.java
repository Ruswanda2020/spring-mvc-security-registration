package com.ruswanda.registerandlogin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    private String id = UUID.randomUUID().toString();
    @Column(unique = true)
    private String email;
    private String password;
    private String role = "USER";
    @Column(name = "full_name")
    private String fullName;
}
