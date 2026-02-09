package com.ese.kafka.user.application.emailUpdated;

import com.ese.kafka.common.application.Command;
import com.ese.kafka.common.application.VoidResponse;
import lombok.Data;

import java.time.Instant;

@Data
public class UserEmailUpdatedCommand implements Command<VoidResponse> {

    private Long id;
    private String email;
    private Instant timestamp;

}
