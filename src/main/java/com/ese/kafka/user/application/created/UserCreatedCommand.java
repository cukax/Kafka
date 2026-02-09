package com.ese.kafka.user.application.created;

import com.ese.kafka.common.application.Command;
import com.ese.kafka.common.application.VoidResponse;
import com.ese.kafka.user.domain.entity.Role;
import lombok.Data;

import java.time.Instant;

@Data
public class UserCreatedCommand implements Command<VoidResponse> {

    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private Role role;
    private Instant timestamp;

}
