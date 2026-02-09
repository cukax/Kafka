package com.ese.kafka.user.infrastructure.database;

import com.ese.kafka.user.domain.entity.Role;
import lombok.Data;

import java.time.Instant;

@Data
public class UserEntity {

    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Role role;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;

}
